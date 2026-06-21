package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.protocol.TransactionNameSource;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.SampleRateUtils;
import io.sentry.util.StringUtils;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Baggage {

    @NotNull
    static final String CHARSET = "UTF-8";

    @NotNull
    static final String SENTRY_BAGGAGE_PREFIX = "sentry-";

    @NotNull
    private final ConcurrentHashMap<String, String> keyValues;

    @NotNull
    private final AutoClosableReentrantLock keyValuesLock;

    @NotNull
    final ILogger logger;
    private boolean mutable;

    @Nullable
    private Double sampleRand;

    @Nullable
    private Double sampleRate;
    private final boolean shouldFreeze;

    @Nullable
    private final String thirdPartyHeader;

    @NotNull
    static final Integer MAX_BAGGAGE_STRING_LENGTH = 8192;

    @NotNull
    static final Integer MAX_BAGGAGE_LIST_MEMBER_COUNT = 64;
    private static final DecimalFormatterThreadLocal decimalFormatter = new DecimalFormatterThreadLocal();

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class DSCKeys {
        public static final String TRACE_ID = "sentry-trace_id";
        public static final String PUBLIC_KEY = "sentry-public_key";
        public static final String RELEASE = "sentry-release";
        public static final String USER_ID = "sentry-user_id";
        public static final String ENVIRONMENT = "sentry-environment";
        public static final String TRANSACTION = "sentry-transaction";
        public static final String SAMPLE_RATE = "sentry-sample_rate";
        public static final String SAMPLE_RAND = "sentry-sample_rand";
        public static final String SAMPLED = "sentry-sampled";
        public static final String REPLAY_ID = "sentry-replay_id";
        public static final String ORG_ID = "sentry-org_id";
        public static final List<String> ALL = Arrays.asList(TRACE_ID, PUBLIC_KEY, RELEASE, USER_ID, ENVIRONMENT, TRANSACTION, SAMPLE_RATE, SAMPLE_RAND, SAMPLED, REPLAY_ID, ORG_ID);
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class DecimalFormatterThreadLocal extends ThreadLocal<DecimalFormat> {
        private DecimalFormatterThreadLocal() {
        }

        @Override // java.lang.ThreadLocal
        public DecimalFormat initialValue() {
            return new DecimalFormat("#.################", DecimalFormatSymbols.getInstance(Locale.ROOT));
        }
    }

    public Baggage(@NotNull ILogger iLogger) {
        this(new ConcurrentHashMap(), null, null, null, true, false, iLogger);
    }

    private static String decode(@NotNull String str) {
        return URLDecoder.decode(str, CHARSET);
    }

    private String encode(@NotNull String str) {
        return URLEncoder.encode(str, CHARSET).replaceAll("\\+", "%20");
    }

    @NotNull
    public static Baggage fromEvent(@NotNull SentryBaseEvent sentryBaseEvent, @Nullable String str, @NotNull SentryOptions sentryOptions) {
        Baggage baggage = new Baggage(sentryOptions.getLogger());
        SpanContext trace = sentryBaseEvent.getContexts().getTrace();
        baggage.setTraceId(trace != null ? trace.getTraceId().toString() : null);
        baggage.setPublicKey(sentryOptions.retrieveParsedDsn().getPublicKey());
        baggage.setRelease(sentryBaseEvent.getRelease());
        baggage.setEnvironment(sentryBaseEvent.getEnvironment());
        baggage.setOrgId(sentryOptions.getEffectiveOrgId());
        baggage.setTransaction(str);
        baggage.setSampleRate(null);
        baggage.setSampled(null);
        baggage.setSampleRand(null);
        Object obj = sentryBaseEvent.getContexts().get("replay_id");
        if (obj != null && !obj.toString().equals(SentryId.EMPTY_ID.toString())) {
            baggage.setReplayId(obj.toString());
            sentryBaseEvent.getContexts().remove("replay_id");
        }
        baggage.freeze();
        return baggage;
    }

    @NotNull
    public static Baggage fromHeader(@Nullable String str) {
        return fromHeader(str, false, ScopesAdapter.getInstance().getOptions().getLogger());
    }

    private static boolean isHighQualityTransactionName(@Nullable TransactionNameSource transactionNameSource) {
        return (transactionNameSource == null || TransactionNameSource.URL.equals(transactionNameSource)) ? false : true;
    }

    @Nullable
    private static Double sampleRand(@Nullable TracesSamplingDecision tracesSamplingDecision) {
        if (tracesSamplingDecision == null) {
            return null;
        }
        return tracesSamplingDecision.getSampleRand();
    }

    @Nullable
    private static Double sampleRate(@Nullable TracesSamplingDecision tracesSamplingDecision) {
        if (tracesSamplingDecision == null) {
            return null;
        }
        return tracesSamplingDecision.getSampleRate();
    }

    @Nullable
    private static String sampleRateToString(@Nullable Double d10) {
        if (SampleRateUtils.isValidTracesSampleRate(d10, false)) {
            return decimalFormatter.get().format(d10);
        }
        return null;
    }

    @Nullable
    private static Boolean sampled(@Nullable TracesSamplingDecision tracesSamplingDecision) {
        if (tracesSamplingDecision == null) {
            return null;
        }
        return tracesSamplingDecision.getSampled();
    }

    @Nullable
    private static Double toDouble(@Nullable String str) {
        if (str != null) {
            try {
                double d10 = Double.parseDouble(str);
                if (SampleRateUtils.isValidTracesSampleRate(Double.valueOf(d10), false)) {
                    return Double.valueOf(d10);
                }
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public void forceSetSampleRate(@Nullable Double d10) {
        this.sampleRate = d10;
    }

    public void freeze() {
        this.mutable = false;
    }

    @Nullable
    public String get(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return this.keyValues.get(str);
    }

    @Nullable
    public String getEnvironment() {
        return get(DSCKeys.ENVIRONMENT);
    }

    @Nullable
    public String getOrgId() {
        return get(DSCKeys.ORG_ID);
    }

    @Nullable
    public String getPublicKey() {
        return get(DSCKeys.PUBLIC_KEY);
    }

    @Nullable
    public String getRelease() {
        return get(DSCKeys.RELEASE);
    }

    @Nullable
    public String getReplayId() {
        return get(DSCKeys.REPLAY_ID);
    }

    @Nullable
    public Double getSampleRand() {
        return this.sampleRand;
    }

    @Nullable
    public Double getSampleRate() {
        return this.sampleRate;
    }

    @Nullable
    public String getSampled() {
        return get(DSCKeys.SAMPLED);
    }

    @Nullable
    public String getThirdPartyHeader() {
        return this.thirdPartyHeader;
    }

    @Nullable
    public String getTraceId() {
        return get(DSCKeys.TRACE_ID);
    }

    @Nullable
    public String getTransaction() {
        return get(DSCKeys.TRANSACTION);
    }

    @NotNull
    public Map<String, Object> getUnknown() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.keyValuesLock.acquire();
        try {
            for (Map.Entry<String, String> entry : this.keyValues.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!DSCKeys.ALL.contains(key) && value != null) {
                    concurrentHashMap.put(key.replaceFirst(SENTRY_BAGGAGE_PREFIX, ""), value);
                }
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return concurrentHashMap;
        } catch (Throwable th2) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Nullable
    public String getUserId() {
        return get(DSCKeys.USER_ID);
    }

    public boolean isMutable() {
        return this.mutable;
    }

    public boolean isShouldFreeze() {
        return this.shouldFreeze;
    }

    public void set(@NotNull String str, @Nullable String str2) {
        if (this.mutable) {
            if (str2 == null) {
                this.keyValues.remove(str);
            } else {
                this.keyValues.put(str, str2);
            }
        }
    }

    public void setEnvironment(@Nullable String str) {
        set(DSCKeys.ENVIRONMENT, str);
    }

    public void setOrgId(@Nullable String str) {
        set(DSCKeys.ORG_ID, str);
    }

    public void setPublicKey(@Nullable String str) {
        set(DSCKeys.PUBLIC_KEY, str);
    }

    public void setRelease(@Nullable String str) {
        set(DSCKeys.RELEASE, str);
    }

    public void setReplayId(@Nullable String str) {
        set(DSCKeys.REPLAY_ID, str);
    }

    public void setSampleRand(@Nullable Double d10) {
        if (isMutable()) {
            this.sampleRand = d10;
        }
    }

    public void setSampleRate(@Nullable Double d10) {
        if (isMutable()) {
            this.sampleRate = d10;
        }
    }

    public void setSampled(@Nullable String str) {
        set(DSCKeys.SAMPLED, str);
    }

    public void setTraceId(@Nullable String str) {
        set(DSCKeys.TRACE_ID, str);
    }

    public void setTransaction(@Nullable String str) {
        set(DSCKeys.TRANSACTION, str);
    }

    public void setUserId(@Nullable String str) {
        set(DSCKeys.USER_ID, str);
    }

    public void setValuesFromSamplingDecision(@Nullable TracesSamplingDecision tracesSamplingDecision) {
        if (tracesSamplingDecision == null) {
            return;
        }
        setSampled(StringUtils.toString(sampled(tracesSamplingDecision)));
        if (tracesSamplingDecision.getSampleRand() != null) {
            setSampleRand(sampleRand(tracesSamplingDecision));
        }
        if (tracesSamplingDecision.getSampleRate() != null) {
            forceSetSampleRate(sampleRate(tracesSamplingDecision));
        }
    }

    public void setValuesFromScope(@NotNull IScope iScope, @NotNull SentryOptions sentryOptions) {
        PropagationContext propagationContext = iScope.getPropagationContext();
        SentryId replayId = iScope.getReplayId();
        setTraceId(propagationContext.getTraceId().toString());
        setPublicKey(sentryOptions.retrieveParsedDsn().getPublicKey());
        setRelease(sentryOptions.getRelease());
        setEnvironment(sentryOptions.getEnvironment());
        if (!SentryId.EMPTY_ID.equals(replayId)) {
            setReplayId(replayId.toString());
        }
        setOrgId(sentryOptions.getEffectiveOrgId());
        setTransaction(null);
        setSampleRate(null);
        setSampled(null);
    }

    public void setValuesFromTransaction(@NotNull SentryId sentryId, @Nullable SentryId sentryId2, @NotNull SentryOptions sentryOptions, @Nullable TracesSamplingDecision tracesSamplingDecision, @Nullable String str, @Nullable TransactionNameSource transactionNameSource) {
        setTraceId(sentryId.toString());
        setPublicKey(sentryOptions.retrieveParsedDsn().getPublicKey());
        setRelease(sentryOptions.getRelease());
        setEnvironment(sentryOptions.getEnvironment());
        if (!isHighQualityTransactionName(transactionNameSource)) {
            str = null;
        }
        setTransaction(str);
        if (sentryId2 != null && !SentryId.EMPTY_ID.equals(sentryId2)) {
            setReplayId(sentryId2.toString());
        }
        setOrgId(sentryOptions.getEffectiveOrgId());
        setSampleRate(sampleRate(tracesSamplingDecision));
        setSampled(StringUtils.toString(sampled(tracesSamplingDecision)));
        setSampleRand(sampleRand(tracesSamplingDecision));
    }

    @NotNull
    public String toHeaderString(@Nullable String str) {
        String str2;
        int iCountOf;
        StringBuilder sb2 = new StringBuilder();
        if (str == null || str.isEmpty()) {
            str2 = "";
            iCountOf = 0;
        } else {
            sb2.append(str);
            iCountOf = StringUtils.countOf(str, ',') + 1;
            str2 = io.appmetrica.analytics.coreutils.internal.StringUtils.COMMA;
        }
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.keyValuesLock.acquire();
        try {
            TreeSet<String> treeSet = new TreeSet(Collections.list(this.keyValues.keys()));
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            treeSet.add(DSCKeys.SAMPLE_RATE);
            treeSet.add(DSCKeys.SAMPLE_RAND);
            for (String str3 : treeSet) {
                String strSampleRateToString = DSCKeys.SAMPLE_RATE.equals(str3) ? sampleRateToString(this.sampleRate) : DSCKeys.SAMPLE_RAND.equals(str3) ? sampleRateToString(this.sampleRand) : this.keyValues.get(str3);
                if (strSampleRateToString != null) {
                    Integer num = MAX_BAGGAGE_LIST_MEMBER_COUNT;
                    if (iCountOf >= num.intValue()) {
                        this.logger.log(SentryLevel.ERROR, "Not adding baggage value %s as the total number of list members would exceed the maximum of %s.", str3, num);
                    } else {
                        try {
                            String str4 = str2 + encode(str3) + "=" + encode(strSampleRateToString);
                            int length = sb2.length() + str4.length();
                            Integer num2 = MAX_BAGGAGE_STRING_LENGTH;
                            if (length > num2.intValue()) {
                                this.logger.log(SentryLevel.ERROR, "Not adding baggage value %s as the total header value length would exceed the maximum of %s.", str3, num2);
                            } else {
                                iCountOf++;
                                sb2.append(str4);
                                str2 = io.appmetrica.analytics.coreutils.internal.StringUtils.COMMA;
                            }
                        } catch (Throwable th2) {
                            this.logger.log(SentryLevel.ERROR, th2, "Unable to encode baggage key value pair (key=%s,value=%s).", str3, strSampleRateToString);
                        }
                    }
                }
            }
            return sb2.toString();
        } catch (Throwable th3) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    @Nullable
    public TraceContext toTraceContext() {
        String traceId = getTraceId();
        String replayId = getReplayId();
        String publicKey = getPublicKey();
        if (traceId == null || publicKey == null) {
            return null;
        }
        SentryId sentryId = new SentryId(traceId);
        SentryId sentryId2 = null;
        String release = getRelease();
        String environment = getEnvironment();
        String userId = getUserId();
        String transaction = getTransaction();
        String strSampleRateToString = sampleRateToString(getSampleRate());
        String sampled = getSampled();
        if (replayId != null) {
            sentryId2 = new SentryId(replayId);
        }
        TraceContext traceContext = new TraceContext(sentryId, publicKey, release, environment, userId, transaction, strSampleRateToString, sampled, sentryId2, sampleRateToString(getSampleRand()));
        traceContext.setUnknown(getUnknown());
        return traceContext;
    }

    public Baggage(@NotNull Baggage baggage) {
        this(baggage.keyValues, baggage.sampleRate, baggage.sampleRand, baggage.thirdPartyHeader, baggage.mutable, baggage.shouldFreeze, baggage.logger);
    }

    public Baggage(@NotNull ConcurrentHashMap<String, String> concurrentHashMap, @Nullable Double d10, @Nullable Double d11, @Nullable String str, boolean z5, boolean z10, @NotNull ILogger iLogger) {
        this.keyValuesLock = new AutoClosableReentrantLock();
        this.keyValues = concurrentHashMap;
        this.sampleRate = d10;
        this.sampleRand = d11;
        this.logger = iLogger;
        this.thirdPartyHeader = str;
        this.mutable = z5;
        this.shouldFreeze = z10;
    }

    @NotNull
    public static Baggage fromHeader(@Nullable List<String> list) {
        return fromHeader(list, false, ScopesAdapter.getInstance().getOptions().getLogger());
    }

    @NotNull
    public static Baggage fromHeader(String str, @NotNull ILogger iLogger) {
        return fromHeader(str, false, iLogger);
    }

    @NotNull
    public static Baggage fromHeader(@Nullable List<String> list, @NotNull ILogger iLogger) {
        return fromHeader(list, false, iLogger);
    }

    @NotNull
    public static Baggage fromHeader(@Nullable List<String> list, boolean z5, @NotNull ILogger iLogger) {
        if (list != null) {
            return fromHeader(StringUtils.join(io.appmetrica.analytics.coreutils.internal.StringUtils.COMMA, list), z5, iLogger);
        }
        return fromHeader((String) null, z5, iLogger);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static io.sentry.Baggage fromHeader(@org.jetbrains.annotations.Nullable java.lang.String r16, boolean r17, @org.jetbrains.annotations.NotNull io.sentry.ILogger r18) {
        /*
            r1 = r16
            r7 = r18
            java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r4 = ","
            r5 = 0
            if (r1 == 0) goto La5
            r0 = -1
            java.lang.String[] r8 = r1.split(r4, r0)     // Catch: java.lang.Throwable -> L94
            int r9 = r8.length     // Catch: java.lang.Throwable -> L94
            r10 = r5
            r11 = r10
            r12 = 0
            r13 = 0
        L1d:
            if (r10 >= r9) goto L92
            r14 = r8[r10]     // Catch: java.lang.Throwable -> L80
            java.lang.String r0 = r14.trim()     // Catch: java.lang.Throwable -> L80
            java.lang.String r15 = "sentry-"
            boolean r0 = r0.startsWith(r15)     // Catch: java.lang.Throwable -> L80
            if (r0 == 0) goto L83
            java.lang.String r0 = "="
            int r0 = r14.indexOf(r0)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r15 = r14.substring(r5, r0)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r15 = r15.trim()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r5 = decode(r15)     // Catch: java.lang.Throwable -> L5c
            int r0 = r0 + 1
            java.lang.String r0 = r14.substring(r0)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = decode(r0)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r6 = "sentry-sample_rate"
            boolean r6 = r6.equals(r5)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r1 = "sentry-sample_rand"
            if (r6 == 0) goto L5e
            java.lang.Double r12 = toDouble(r0)     // Catch: java.lang.Throwable -> L5c
            goto L6c
        L5c:
            r0 = move-exception
            goto L74
        L5e:
            boolean r6 = r1.equals(r5)     // Catch: java.lang.Throwable -> L5c
            if (r6 == 0) goto L69
            java.lang.Double r13 = toDouble(r0)     // Catch: java.lang.Throwable -> L5c
            goto L6c
        L69:
            r2.put(r5, r0)     // Catch: java.lang.Throwable -> L5c
        L6c:
            boolean r0 = r1.equalsIgnoreCase(r15)     // Catch: java.lang.Throwable -> L5c
            if (r0 != 0) goto L8c
            r11 = 1
            goto L8c
        L74:
            io.sentry.SentryLevel r1 = io.sentry.SentryLevel.ERROR     // Catch: java.lang.Throwable -> L80
            java.lang.String r5 = "Unable to decode baggage key value pair %s"
            java.lang.Object[] r6 = new java.lang.Object[]{r14}     // Catch: java.lang.Throwable -> L80
            r7.log(r1, r0, r5, r6)     // Catch: java.lang.Throwable -> L80
            goto L8c
        L80:
            r0 = move-exception
            r5 = r11
            goto L98
        L83:
            if (r17 == 0) goto L8c
            java.lang.String r0 = r14.trim()     // Catch: java.lang.Throwable -> L80
            r3.add(r0)     // Catch: java.lang.Throwable -> L80
        L8c:
            int r10 = r10 + 1
            r5 = 0
            r1 = r16
            goto L1d
        L92:
            r6 = r11
            goto La8
        L94:
            r0 = move-exception
            r5 = 0
            r12 = 0
            r13 = 0
        L98:
            io.sentry.SentryLevel r1 = io.sentry.SentryLevel.ERROR
            java.lang.String r6 = "Unable to decode baggage header %s"
            java.lang.Object[] r8 = new java.lang.Object[]{r16}
            r7.log(r1, r0, r6, r8)
            r6 = r5
            goto La8
        La5:
            r6 = 0
            r12 = 0
            r13 = 0
        La8:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto Lb0
            r4 = 0
            goto Lb5
        Lb0:
            java.lang.String r0 = io.sentry.util.StringUtils.join(r4, r3)
            r4 = r0
        Lb5:
            io.sentry.Baggage r0 = new io.sentry.Baggage
            r5 = 1
            r1 = r2
            r2 = r12
            r3 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.Baggage.fromHeader(java.lang.String, boolean, io.sentry.ILogger):io.sentry.Baggage");
    }
}

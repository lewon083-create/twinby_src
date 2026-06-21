package io.sentry.android.replay;

import androidx.compose.runtime.internal.StabilityInferred;
import ij.g;
import ij.h;
import ij.i;
import io.sentry.Breadcrumb;
import io.sentry.Hint;
import io.sentry.ReplayBreadcrumbConverter;
import io.sentry.SentryBaseEvent;
import io.sentry.SentryLogEvent;
import io.sentry.SentryOptions;
import io.sentry.SpanDataConvention;
import io.sentry.TypeCheckHint;
import io.sentry.protocol.Request;
import io.sentry.protocol.Response;
import io.sentry.rrweb.RRWebSpanEvent;
import io.sentry.rrweb.RRWebVideoEvent;
import io.sentry.util.network.NetworkBody;
import io.sentry.util.network.NetworkRequestData;
import io.sentry.util.network.ReplayNetworkRequestOrResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.a0;
import kotlin.text.e0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata
public class DefaultReplayBreadcrumbConverter implements ReplayBreadcrumbConverter {
    private static final int MAX_HTTP_NETWORK_DETAILS = 32;

    @NotNull
    private static final HashSet<String> supportedNetworkData;
    private final Map<Breadcrumb, NetworkRequestData> httpNetworkDetails;

    @Nullable
    private String lastConnectivityState;

    @Nullable
    private SentryOptions options;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final g snakecasePattern$delegate = h.a(i.f21338c, DefaultReplayBreadcrumbConverter$Companion$snakecasePattern$2.INSTANCE);

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Regex getSnakecasePattern() {
            return (Regex) DefaultReplayBreadcrumbConverter.snakecasePattern$delegate.getValue();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public final class ReplayBeforeBreadcrumbCallback implements SentryOptions.BeforeBreadcrumbCallback {

        @Nullable
        private final SentryOptions.BeforeBreadcrumbCallback delegate;

        public ReplayBeforeBreadcrumbCallback(@Nullable SentryOptions.BeforeBreadcrumbCallback beforeBreadcrumbCallback) {
            this.delegate = beforeBreadcrumbCallback;
        }

        private final NetworkRequestData extractNetworkRequestDataFromHint(Breadcrumb breadcrumb, Hint hint) {
            if (!Intrinsics.a(breadcrumb.getType(), "http") && !Intrinsics.a(breadcrumb.getCategory(), "http")) {
                return null;
            }
            Object obj = hint.get(TypeCheckHint.SENTRY_REPLAY_NETWORK_DETAILS);
            if (obj instanceof NetworkRequestData) {
                return (NetworkRequestData) obj;
            }
            return null;
        }

        @Override // io.sentry.SentryOptions.BeforeBreadcrumbCallback
        @Nullable
        public Breadcrumb execute(@NotNull Breadcrumb breadcrumb, @NotNull Hint hint) {
            Intrinsics.checkNotNullParameter(breadcrumb, "breadcrumb");
            Intrinsics.checkNotNullParameter(hint, "hint");
            SentryOptions.BeforeBreadcrumbCallback beforeBreadcrumbCallback = this.delegate;
            if (beforeBreadcrumbCallback != null) {
                breadcrumb = beforeBreadcrumbCallback.execute(breadcrumb, hint);
            }
            if (breadcrumb != null) {
                DefaultReplayBreadcrumbConverter defaultReplayBreadcrumbConverter = DefaultReplayBreadcrumbConverter.this;
                NetworkRequestData networkRequestDataExtractNetworkRequestDataFromHint = extractNetworkRequestDataFromHint(breadcrumb, hint);
                if (networkRequestDataExtractNetworkRequestDataFromHint != null) {
                    Map map = defaultReplayBreadcrumbConverter.httpNetworkDetails;
                    Intrinsics.checkNotNullExpressionValue(map, "access$getHttpNetworkDetails$p(...)");
                    map.put(breadcrumb, networkRequestDataExtractNetworkRequestDataFromHint);
                }
            }
            return breadcrumb;
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.DefaultReplayBreadcrumbConverter$snakeToCamelCase$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass1 extends r implements Function1<MatchResult, CharSequence> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(MatchResult it) {
            Intrinsics.checkNotNullParameter(it, "it");
            String upperCase = String.valueOf(e0.w(it.getValue())).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return upperCase;
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(Response.JsonKeys.STATUS_CODE);
        hashSet.add(Request.JsonKeys.METHOD);
        hashSet.add("response_content_length");
        hashSet.add("request_content_length");
        hashSet.add(SpanDataConvention.HTTP_RESPONSE_CONTENT_LENGTH_KEY);
        hashSet.add("http.request_content_length");
        supportedNetworkData = hashSet;
    }

    public DefaultReplayBreadcrumbConverter() {
        this.httpNetworkDetails = Collections.synchronizedMap(new LinkedHashMap<Breadcrumb, NetworkRequestData>() { // from class: io.sentry.android.replay.DefaultReplayBreadcrumbConverter$httpNetworkDetails$1
            public /* bridge */ boolean containsKey(Breadcrumb breadcrumb) {
                return super.containsKey((Object) breadcrumb);
            }

            public /* bridge */ boolean containsValue(NetworkRequestData networkRequestData) {
                return super.containsValue((Object) networkRequestData);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Map.Entry<Breadcrumb, NetworkRequestData>> entrySet() {
                return getEntries();
            }

            public /* bridge */ NetworkRequestData get(Breadcrumb breadcrumb) {
                return (NetworkRequestData) super.get((Object) breadcrumb);
            }

            public /* bridge */ Set<Map.Entry<Breadcrumb, NetworkRequestData>> getEntries() {
                return super.entrySet();
            }

            public /* bridge */ Set<Breadcrumb> getKeys() {
                return super.keySet();
            }

            public /* bridge */ NetworkRequestData getOrDefault(Breadcrumb breadcrumb, NetworkRequestData networkRequestData) {
                return (NetworkRequestData) super.getOrDefault((Object) breadcrumb, networkRequestData);
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ Collection<NetworkRequestData> getValues() {
                return super.values();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Breadcrumb> keySet() {
                return getKeys();
            }

            public /* bridge */ NetworkRequestData remove(Breadcrumb breadcrumb) {
                return (NetworkRequestData) super.remove((Object) breadcrumb);
            }

            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry<Breadcrumb, NetworkRequestData> entry) {
                return size() > 32;
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ int size() {
                return getSize();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Collection<NetworkRequestData> values() {
                return getValues();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsKey(Object obj) {
                if (obj instanceof Breadcrumb) {
                    return containsKey((Breadcrumb) obj);
                }
                return false;
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsValue(Object obj) {
                if (obj instanceof NetworkRequestData) {
                    return containsValue((NetworkRequestData) obj);
                }
                return false;
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ NetworkRequestData get(Object obj) {
                if (obj instanceof Breadcrumb) {
                    return get((Breadcrumb) obj);
                }
                return null;
            }

            public final /* bridge */ NetworkRequestData getOrDefault(Object obj, NetworkRequestData networkRequestData) {
                return !(obj instanceof Breadcrumb) ? networkRequestData : getOrDefault((Breadcrumb) obj, networkRequestData);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ NetworkRequestData remove(Object obj) {
                if (obj instanceof Breadcrumb) {
                    return remove((Breadcrumb) obj);
                }
                return null;
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object get(Object obj) {
                if (obj instanceof Breadcrumb) {
                    return get((Breadcrumb) obj);
                }
                return null;
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
                return !(obj instanceof Breadcrumb) ? obj2 : getOrDefault((Breadcrumb) obj, (NetworkRequestData) obj2);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object remove(Object obj) {
                if (obj instanceof Breadcrumb) {
                    return remove((Breadcrumb) obj);
                }
                return null;
            }

            public /* bridge */ boolean remove(Breadcrumb breadcrumb, NetworkRequestData networkRequestData) {
                return super.remove((Object) breadcrumb, (Object) networkRequestData);
            }

            @Override // java.util.HashMap, java.util.Map
            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                if ((obj instanceof Breadcrumb) && (obj2 instanceof NetworkRequestData)) {
                    return remove((Breadcrumb) obj, (NetworkRequestData) obj2);
                }
                return false;
            }
        });
    }

    private final boolean isValidForRRWebSpan(Breadcrumb breadcrumb) {
        Object obj = breadcrumb.getData().get("url");
        String str = obj instanceof String ? (String) obj : null;
        if (str == null || str.length() == 0) {
            return false;
        }
        Map<String, Object> data = breadcrumb.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        if (!data.containsKey(SpanDataConvention.HTTP_START_TIMESTAMP)) {
            return false;
        }
        Map<String, Object> data2 = breadcrumb.getData();
        Intrinsics.checkNotNullExpressionValue(data2, "getData(...)");
        return data2.containsKey(SpanDataConvention.HTTP_END_TIMESTAMP);
    }

    private final String snakeToCamelCase(String str) {
        return Companion.getSnakecasePattern().c(str, AnonymousClass1.INSTANCE);
    }

    private final RRWebSpanEvent toRRWebSpanEvent(Breadcrumb breadcrumb) {
        double dLongValue;
        double dLongValue2;
        Object obj = breadcrumb.getData().get(SpanDataConvention.HTTP_START_TIMESTAMP);
        Object obj2 = breadcrumb.getData().get(SpanDataConvention.HTTP_END_TIMESTAMP);
        RRWebSpanEvent rRWebSpanEvent = new RRWebSpanEvent();
        rRWebSpanEvent.setTimestamp(breadcrumb.getTimestamp().getTime());
        rRWebSpanEvent.setOp("resource.http");
        Object obj3 = breadcrumb.getData().get("url");
        Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
        rRWebSpanEvent.setDescription((String) obj3);
        if (obj instanceof Double) {
            dLongValue = ((Number) obj).doubleValue();
        } else {
            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Long");
            dLongValue = ((Long) obj).longValue();
        }
        rRWebSpanEvent.setStartTimestamp(dLongValue / 1000.0d);
        if (obj2 instanceof Double) {
            dLongValue2 = ((Number) obj2).doubleValue();
        } else {
            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.Long");
            dLongValue2 = ((Long) obj2).longValue();
        }
        rRWebSpanEvent.setEndTimestamp(dLongValue2 / 1000.0d);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        NetworkRequestData networkRequestDataRemove = this.httpNetworkDetails.remove(breadcrumb);
        if (networkRequestDataRemove != null) {
            String method = networkRequestDataRemove.getMethod();
            if (method != null) {
                linkedHashMap.put(Request.JsonKeys.METHOD, method);
            }
            Integer statusCode = networkRequestDataRemove.getStatusCode();
            if (statusCode != null) {
                linkedHashMap.put("statusCode", statusCode);
            }
            Long requestBodySize = networkRequestDataRemove.getRequestBodySize();
            if (requestBodySize != null) {
                linkedHashMap.put("requestBodySize", requestBodySize);
            }
            Long responseBodySize = networkRequestDataRemove.getResponseBodySize();
            if (responseBodySize != null) {
                linkedHashMap.put("responseBodySize", responseBodySize);
            }
            ReplayNetworkRequestOrResponse request = networkRequestDataRemove.getRequest();
            if (request != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Long size = request.getSize();
                if (size != null) {
                    linkedHashMap2.put(RRWebVideoEvent.JsonKeys.SIZE, size);
                }
                NetworkBody body = request.getBody();
                if (body != null) {
                    linkedHashMap2.put(SentryLogEvent.JsonKeys.BODY, body.getBody());
                    List<NetworkBody.NetworkBodyWarning> warnings = body.getWarnings();
                    if (warnings != null) {
                        List<NetworkBody.NetworkBodyWarning> list = warnings;
                        ArrayList arrayList = new ArrayList(t.j(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((NetworkBody.NetworkBodyWarning) it.next()).getValue());
                        }
                        linkedHashMap2.put("warnings", arrayList);
                    }
                }
                Map<String, String> headers = request.getHeaders();
                Intrinsics.checkNotNullExpressionValue(headers, "getHeaders(...)");
                if (!headers.isEmpty()) {
                    linkedHashMap2.put("headers", request.getHeaders());
                }
                if (!linkedHashMap2.isEmpty()) {
                    linkedHashMap.put(SentryBaseEvent.JsonKeys.REQUEST, linkedHashMap2);
                }
            }
            ReplayNetworkRequestOrResponse response = networkRequestDataRemove.getResponse();
            if (response != null) {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                Long size2 = response.getSize();
                if (size2 != null) {
                    linkedHashMap3.put(RRWebVideoEvent.JsonKeys.SIZE, size2);
                }
                NetworkBody body2 = response.getBody();
                if (body2 != null) {
                    linkedHashMap3.put(SentryLogEvent.JsonKeys.BODY, body2.getBody());
                    List<NetworkBody.NetworkBodyWarning> warnings2 = body2.getWarnings();
                    if (warnings2 != null) {
                        List<NetworkBody.NetworkBodyWarning> list2 = warnings2;
                        ArrayList arrayList2 = new ArrayList(t.j(list2, 10));
                        Iterator<T> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((NetworkBody.NetworkBodyWarning) it2.next()).getValue());
                        }
                        linkedHashMap3.put("warnings", arrayList2);
                    }
                }
                Map<String, String> headers2 = response.getHeaders();
                Intrinsics.checkNotNullExpressionValue(headers2, "getHeaders(...)");
                if (!headers2.isEmpty()) {
                    linkedHashMap3.put("headers", response.getHeaders());
                }
                if (!linkedHashMap3.isEmpty()) {
                    linkedHashMap.put(Response.TYPE, linkedHashMap3);
                }
            }
        }
        Map<String, Object> data = breadcrumb.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (supportedNetworkData.contains(key)) {
                Intrinsics.b(key);
                String strL = a0.l(key, "content_length", "body_size");
                linkedHashMap.put(snakeToCamelCase(StringsKt.M(strL, ".", strL)), value);
            }
        }
        rRWebSpanEvent.setData(linkedHashMap);
        return rRWebSpanEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0229  */
    @Override // io.sentry.ReplayBreadcrumbConverter
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public io.sentry.rrweb.RRWebEvent convert(@org.jetbrains.annotations.NotNull io.sentry.Breadcrumb r10) {
        /*
            Method dump skipped, instruction units count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.DefaultReplayBreadcrumbConverter.convert(io.sentry.Breadcrumb):io.sentry.rrweb.RRWebEvent");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultReplayBreadcrumbConverter(@NotNull SentryOptions options) {
        this();
        Intrinsics.checkNotNullParameter(options, "options");
        this.options = options;
        if (options == null) {
            return;
        }
        options.setBeforeBreadcrumb(new ReplayBeforeBreadcrumbCallback(options.getBeforeBreadcrumb()));
    }
}

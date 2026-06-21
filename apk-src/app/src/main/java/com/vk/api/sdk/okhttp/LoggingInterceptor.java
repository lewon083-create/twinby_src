package com.vk.api.sdk.okhttp;

import com.vk.api.sdk.exceptions.VKApiCodes;
import com.vk.api.sdk.utils.ThreadLocalDelegate;
import com.vk.api.sdk.utils.ThreadLocalDelegateKt;
import com.vk.api.sdk.utils.log.Logger;
import dk.i;
import ek.j;
import ek.u;
import ek.x;
import el.f;
import ij.g;
import ij.h;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.j0;
import kotlin.collections.s;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.z;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.p;
import kotlin.text.q;
import ml.a;
import ml.c;
import zk.b0;
import zk.d0;
import zk.n;
import zk.o;

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
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class LoggingInterceptor implements o {
    static final /* synthetic */ i[] $$delegatedProperties;
    public static final Companion Companion;
    private static final Map<Integer, a> levelsMap;
    private final ThreadLocalDelegate delegate$delegate;
    private final boolean filterCredentials;
    private final Collection<String> keysToFilter;
    private final g kvKeysExtractorPattern$delegate;
    private final g kvKeysRestorePattern$delegate;
    private final Logger logger;
    private final LoggingPrefixer loggingPrefixer;
    private ThreadLocal<String> prefix;
    private final g restoreKVKeysTransformer$delegate;
    private final g sensitiveKeyRequestTransformer$delegate;
    private final g sensitiveKeyValuesResponseRegex$delegate;
    private final g sensitiveKeyValuesResponseTransformer$delegate;
    private final g sensitiveKeysRequestRegex$delegate;
    private final g sensitiveKeysResponseRegex$delegate;
    private final g sensitiveKeysResponseTransformer$delegate;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.vk.api.sdk.okhttp.LoggingInterceptor$removeSensitiveKeys$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass1 extends r implements Function1<MatchResult, CharSequence> {
        final /* synthetic */ Iterator<String> $hiddenKVKeys;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Iterator<String> it) {
            super(1);
            this.$hiddenKVKeys = it;
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(MatchResult matchResult) {
            Intrinsics.checkNotNullParameter(matchResult, "matchResult");
            return (CharSequence) LoggingInterceptor.this.getRestoreKVKeysTransformer().invoke(matchResult, this.$hiddenKVKeys.next());
        }
    }

    static {
        z zVar = new z(LoggingInterceptor.class, "delegate", "getDelegate()Lokhttp3/logging/HttpLoggingInterceptor;", 0);
        g0.f27511a.getClass();
        $$delegatedProperties = new i[]{zVar};
        Companion = new Companion(null);
        Logger.LogLevel logLevel = Logger.LogLevel.NONE;
        Integer numValueOf = Integer.valueOf(logLevel.getLevel());
        a aVar = a.f28950b;
        levelsMap = j0.g(new Pair(numValueOf, aVar), new Pair(Integer.valueOf(Logger.LogLevel.ERROR.getLevel()), aVar), new Pair(Integer.valueOf(Logger.LogLevel.WARNING.getLevel()), a.f28951c), new Pair(Integer.valueOf(Logger.LogLevel.DEBUG.getLevel()), a.f28952d), new Pair(Integer.valueOf(Logger.LogLevel.VERBOSE.getLevel()), a.f28953e), new Pair(Integer.valueOf(logLevel.getLevel()), aVar));
    }

    public LoggingInterceptor(boolean z5, Collection<String> keysToFilter, Logger logger, LoggingPrefixer loggingPrefixer) {
        Intrinsics.checkNotNullParameter(keysToFilter, "keysToFilter");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(loggingPrefixer, "loggingPrefixer");
        this.filterCredentials = z5;
        this.keysToFilter = keysToFilter;
        this.logger = logger;
        this.loggingPrefixer = loggingPrefixer;
        this.sensitiveKeysRequestRegex$delegate = h.b(new LoggingInterceptor$sensitiveKeysRequestRegex$2(this));
        this.sensitiveKeyRequestTransformer$delegate = h.b(LoggingInterceptor$sensitiveKeyRequestTransformer$2.INSTANCE);
        this.sensitiveKeysResponseRegex$delegate = h.b(new LoggingInterceptor$sensitiveKeysResponseRegex$2(this));
        this.sensitiveKeysResponseTransformer$delegate = h.b(LoggingInterceptor$sensitiveKeysResponseTransformer$2.INSTANCE);
        this.kvKeysExtractorPattern$delegate = h.b(LoggingInterceptor$kvKeysExtractorPattern$2.INSTANCE);
        this.kvKeysRestorePattern$delegate = h.b(LoggingInterceptor$kvKeysRestorePattern$2.INSTANCE);
        this.restoreKVKeysTransformer$delegate = h.b(LoggingInterceptor$restoreKVKeysTransformer$2.INSTANCE);
        this.sensitiveKeyValuesResponseRegex$delegate = h.b(new LoggingInterceptor$sensitiveKeyValuesResponseRegex$2(this));
        this.sensitiveKeyValuesResponseTransformer$delegate = h.b(LoggingInterceptor$sensitiveKeyValuesResponseTransformer$2.INSTANCE);
        this.prefix = new ThreadLocal<>();
        this.delegate$delegate = ThreadLocalDelegateKt.threadLocal(new LoggingInterceptor$delegate$2(this));
    }

    private final c getDelegate() {
        return (c) this.delegate$delegate.getValue(this, $$delegatedProperties[0]);
    }

    private final Regex getKvKeysExtractorPattern() {
        return (Regex) this.kvKeysExtractorPattern$delegate.getValue();
    }

    private final Regex getKvKeysRestorePattern() {
        return (Regex) this.kvKeysRestorePattern$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Function2<MatchResult, String, CharSequence> getRestoreKVKeysTransformer() {
        return (Function2) this.restoreKVKeysTransformer$delegate.getValue();
    }

    private final Function1<MatchResult, CharSequence> getSensitiveKeyRequestTransformer() {
        return (Function1) this.sensitiveKeyRequestTransformer$delegate.getValue();
    }

    private final Regex getSensitiveKeyValuesResponseRegex() {
        return (Regex) this.sensitiveKeyValuesResponseRegex$delegate.getValue();
    }

    private final Function1<MatchResult, CharSequence> getSensitiveKeyValuesResponseTransformer() {
        return (Function1) this.sensitiveKeyValuesResponseTransformer$delegate.getValue();
    }

    private final Regex getSensitiveKeysRequestRegex() {
        return (Regex) this.sensitiveKeysRequestRegex$delegate.getValue();
    }

    private final Regex getSensitiveKeysResponseRegex() {
        return (Regex) this.sensitiveKeysResponseRegex$delegate.getValue();
    }

    private final Function1<MatchResult, CharSequence> getSensitiveKeysResponseTransformer() {
        return (Function1) this.sensitiveKeysResponseTransformer$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String removeSensitiveKeys(String input) {
        Regex kvKeysExtractorPattern = getKvKeysExtractorPattern();
        q qVar = Regex.f27536c;
        kvKeysExtractorPattern.getClass();
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.length() < 0) {
            throw new IndexOutOfBoundsException("Start index out of bounds: 0, input length: " + input.length());
        }
        p seedFunction = new p(0, kvKeysExtractorPattern, input);
        kotlin.text.r nextFunction = kotlin.text.r.f27577b;
        Intrinsics.checkNotNullParameter(seedFunction, "seedFunction");
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return getSensitiveKeyValuesResponseRegex().c(getKvKeysRestorePattern().c(getSensitiveKeysResponseRegex().c(getSensitiveKeysRequestRegex().c(input, getSensitiveKeyRequestTransformer()), getSensitiveKeysResponseTransformer()), new AnonymousClass1(new x(u.e(new j(seedFunction, nextFunction), LoggingInterceptor$removeSensitiveKeys$hiddenKVKeys$1.INSTANCE)))), getSensitiveKeyValuesResponseTransformer());
    }

    @Override // zk.o
    public d0 intercept(n chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        zk.x xVar = ((f) chain).f16440e;
        b0 b0Var = xVar.f46514d;
        long jContentLength = b0Var == null ? 0L : b0Var.contentLength();
        Intrinsics.checkNotNullParameter(LogLevelRequestTag.class, "type");
        LogLevelRequestTag logLevelRequestTag = (LogLevelRequestTag) LogLevelRequestTag.class.cast(xVar.f46515e.get(LogLevelRequestTag.class));
        Logger.LogLevel level = logLevelRequestTag == null ? null : logLevelRequestTag.getLevel();
        if (level == null) {
            level = (Logger.LogLevel) this.logger.getLogLevel().getValue();
        }
        c delegate = getDelegate();
        a aVar = (jContentLength > 4096 || jContentLength <= 0) ? levelsMap.get(Integer.valueOf(Math.min(Logger.LogLevel.WARNING.getLevel(), level.getLevel()))) : levelsMap.get(Integer.valueOf(level.getLevel()));
        Intrinsics.b(aVar);
        delegate.getClass();
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        delegate.f28956b = aVar;
        this.prefix.set(this.loggingPrefixer.getPrefix());
        return getDelegate().intercept(chain);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoggingInterceptor(boolean z5, Logger logger) {
        this(z5, s.f(VKApiCodes.EXTRA_ACCESS_TOKEN, "key", "client_secret"), logger, new DefaultLoggingPrefixer());
        Intrinsics.checkNotNullParameter(logger, "logger");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoggingInterceptor(boolean z5, Collection<String> keysToFilter, Logger logger) {
        this(z5, keysToFilter, logger, new DefaultLoggingPrefixer());
        Intrinsics.checkNotNullParameter(keysToFilter, "keysToFilter");
        Intrinsics.checkNotNullParameter(logger, "logger");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoggingInterceptor(boolean z5, Logger logger, LoggingPrefixer loggingPrefixer) {
        this(z5, s.f(VKApiCodes.EXTRA_ACCESS_TOKEN, "key", "client_secret"), logger, loggingPrefixer);
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(loggingPrefixer, "loggingPrefixer");
    }
}

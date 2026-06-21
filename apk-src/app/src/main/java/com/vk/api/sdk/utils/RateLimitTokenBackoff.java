package com.vk.api.sdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import ij.g;
import ij.h;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;

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
public final class RateLimitTokenBackoff {
    private final float factor;
    private final long maxBackoffTime;
    private final long minBackoffTime;
    private final TokenStore store;
    private final Function0<Long> timeProvider;

    /* JADX INFO: renamed from: com.vk.api.sdk.utils.RateLimitTokenBackoff$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass1 extends r implements Function0<Long> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(SystemClock.elapsedRealtime());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class TokenMemStore implements TokenStore {
        private final ConcurrentHashMap<String, Pair<Long, Integer>> storage = new ConcurrentHashMap<>();
        private final Object obj = new Object();

        @Override // com.vk.api.sdk.utils.RateLimitTokenBackoff.TokenStore
        public boolean has(String token) {
            Intrinsics.checkNotNullParameter(token, "token");
            return this.storage.containsKey(token);
        }

        @Override // com.vk.api.sdk.utils.RateLimitTokenBackoff.TokenStore
        public void reset(String token) {
            Intrinsics.checkNotNullParameter(token, "token");
            synchronized (this.obj) {
                this.storage.remove(token);
            }
        }

        @Override // com.vk.api.sdk.utils.RateLimitTokenBackoff.TokenStore
        public Pair<Long, Integer> restore(String token, long j10) {
            Intrinsics.checkNotNullParameter(token, "token");
            Pair<Long, Integer> pair = this.storage.get(token);
            return pair == null ? new Pair<>(Long.valueOf(j10), 0) : pair;
        }

        @Override // com.vk.api.sdk.utils.RateLimitTokenBackoff.TokenStore
        public void store(String token, long j10) {
            Integer num;
            Intrinsics.checkNotNullParameter(token, "token");
            synchronized (this.obj) {
                Pair<Long, Integer> pair = this.storage.get(token);
                int iIntValue = 0;
                if (pair != null && (num = (Integer) pair.f27470c) != null) {
                    iIntValue = num.intValue() + 1;
                }
                this.storage.put(token, new Pair<>(Long.valueOf(j10), Integer.valueOf(iIntValue)));
                Unit unit = Unit.f27471a;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class TokenPrefStore implements TokenStore {
        public static final Companion Companion = new Companion(null);
        private static final String PREF_NAME = "rate_limit_backoff_storage";
        private final g prefStorage$delegate;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        public TokenPrefStore(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.prefStorage$delegate = h.b(new RateLimitTokenBackoff$TokenPrefStore$prefStorage$2(context));
        }

        private final SharedPreferences getPrefStorage() {
            return (SharedPreferences) this.prefStorage$delegate.getValue();
        }

        @Override // com.vk.api.sdk.utils.RateLimitTokenBackoff.TokenStore
        public boolean has(String token) {
            Intrinsics.checkNotNullParameter(token, "token");
            return getPrefStorage().contains(token);
        }

        @Override // com.vk.api.sdk.utils.RateLimitTokenBackoff.TokenStore
        public void reset(String token) {
            Intrinsics.checkNotNullParameter(token, "token");
            getPrefStorage().edit().remove(token).apply();
        }

        @Override // com.vk.api.sdk.utils.RateLimitTokenBackoff.TokenStore
        public Pair<Long, Integer> restore(String token, long j10) {
            Intrinsics.checkNotNullParameter(token, "token");
            return new Pair<>(Long.valueOf(getPrefStorage().getLong(token, j10)), 0);
        }

        @Override // com.vk.api.sdk.utils.RateLimitTokenBackoff.TokenStore
        public void store(String token, long j10) {
            Intrinsics.checkNotNullParameter(token, "token");
            getPrefStorage().edit().putLong(token, j10).apply();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public interface TokenStore {
        boolean has(String str);

        void reset(String str);

        Pair<Long, Integer> restore(String str, long j10);

        void store(String str, long j10);
    }

    public RateLimitTokenBackoff(TokenStore store, long j10, long j11, float f10, Function0<Long> timeProvider) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.store = store;
        this.minBackoffTime = j10;
        this.maxBackoffTime = j11;
        this.factor = f10;
        this.timeProvider = timeProvider;
    }

    private final long calculate(int i) {
        long j10 = this.minBackoffTime;
        for (int i10 = 0; i10 < i; i10++) {
            j10 = (long) (j10 * this.factor);
        }
        return Math.min(j10, this.maxBackoffTime);
    }

    private final long time() {
        return ((Number) this.timeProvider.invoke()).longValue();
    }

    public final void backoff(String operationKey) {
        Intrinsics.checkNotNullParameter(operationKey, "operationKey");
        this.store.store(operationKey, time());
    }

    public final void reset(String operationKey) {
        Intrinsics.checkNotNullParameter(operationKey, "operationKey");
        if (this.store.has(operationKey)) {
            this.store.reset(operationKey);
        }
    }

    public final boolean shouldWait(String operationKey) {
        Intrinsics.checkNotNullParameter(operationKey, "operationKey");
        return waitTime(operationKey) > 0;
    }

    public final long waitTime(String operationKey) {
        Intrinsics.checkNotNullParameter(operationKey, "operationKey");
        if (!this.store.has(operationKey)) {
            return 0L;
        }
        Pair<Long, Integer> pairRestore = this.store.restore(operationKey, Long.MAX_VALUE);
        long jLongValue = ((Number) pairRestore.f27469b).longValue();
        int iIntValue = ((Number) pairRestore.f27470c).intValue();
        long jTime = time() - jLongValue;
        long jCalculate = calculate(iIntValue);
        if (jTime >= 0 && jTime < jCalculate) {
            return jCalculate - jTime;
        }
        return 0L;
    }

    public /* synthetic */ RateLimitTokenBackoff(TokenStore tokenStore, long j10, long j11, float f10, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(tokenStore, j10, (i & 4) != 0 ? j10 : j11, (i & 8) != 0 ? 1.5f : f10, (i & 16) != 0 ? AnonymousClass1.INSTANCE : function0);
    }
}

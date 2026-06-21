package io.appmetrica.analytics.coreutils.internal.cache;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface CachedDataProvider {

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class CachedData<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f21784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile long f21785b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile long f21786c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f21787d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Object f21788e = null;

        public CachedData(long j10, long j11, @NonNull String str) {
            this.f21784a = pe.a.f("[CachedData-", str, "]");
            this.f21785b = j10;
            this.f21786c = j11;
        }

        public T getData() {
            return (T) this.f21788e;
        }

        public long getExpiryTime() {
            return this.f21786c;
        }

        public long getRefreshTime() {
            return this.f21785b;
        }

        public final boolean isEmpty() {
            return this.f21788e == null;
        }

        public void setData(T t10) {
            this.f21788e = t10;
            this.f21787d = System.currentTimeMillis();
        }

        public void setExpirationPolicy(long j10, long j11) {
            this.f21785b = j10;
            this.f21786c = j11;
        }

        public final boolean shouldClearData() {
            if (this.f21787d == 0) {
                return false;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f21787d;
            return jCurrentTimeMillis > this.f21786c || jCurrentTimeMillis < 0;
        }

        public final boolean shouldUpdateData() {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f21787d;
            return jCurrentTimeMillis > this.f21785b || jCurrentTimeMillis < 0;
        }

        @NonNull
        public String toString() {
            return "CachedData{tag='" + this.f21784a + "', refreshTime=" + this.f21785b + ", expiryTime=" + this.f21786c + ", mCachedTime=" + this.f21787d + ", mCachedData=" + this.f21788e + '}';
        }
    }
}

package f9;

import com.vk.api.sdk.exceptions.VKApiCodes;
import io.sentry.SentryReplayEvent;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f16696f = new a(SentryReplayEvent.REPLAY_VIDEO_MAX_SIZE, VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM, 10000, 604800000, 81920);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f16700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16701e;

    public a(long j10, int i, int i10, long j11, int i11) {
        this.f16697a = j10;
        this.f16698b = i;
        this.f16699c = i10;
        this.f16700d = j11;
        this.f16701e = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f16697a == aVar.f16697a && this.f16698b == aVar.f16698b && this.f16699c == aVar.f16699c && this.f16700d == aVar.f16700d && this.f16701e == aVar.f16701e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f16697a;
        int i = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f16698b) * 1000003) ^ this.f16699c) * 1000003;
        long j11 = this.f16700d;
        return ((i ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f16701e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f16697a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f16698b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f16699c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.f16700d);
        sb2.append(", maxBlobByteSizePerRow=");
        return z.d(this.f16701e, "}", sb2);
    }
}

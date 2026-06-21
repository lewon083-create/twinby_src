package y3;

import com.google.android.gms.internal.measurement.j4;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends j4.f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f36313k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile boolean f36314l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f36315m;

    @Override // m4.k
    public final void d() {
        this.f36314l = true;
    }

    @Override // m4.k
    public final void load() {
        try {
            this.f26476j.open(this.f26470c);
            int i = 0;
            int i10 = 0;
            while (i != -1 && !this.f36314l) {
                byte[] bArr = this.f36313k;
                if (bArr.length < i10 + 16384) {
                    this.f36313k = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i = this.f26476j.read(this.f36313k, i10, 16384);
                if (i != -1) {
                    i10 += i;
                }
            }
            if (!this.f36314l) {
                this.f36315m = Arrays.copyOf(this.f36313k, i10);
            }
            j4.g(this.f26476j);
        } catch (Throwable th2) {
            j4.g(this.f26476j);
            throw th2;
        }
    }
}

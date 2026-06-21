package u3;

import ad.n0;
import ad.o0;
import ad.q1;
import android.os.Build;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f34067d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o0 f34070c;

    static {
        a aVar;
        if (Build.VERSION.SDK_INT >= 33) {
            n0 n0Var = new n0(4);
            for (int i = 1; i <= 10; i++) {
                n0Var.b(Integer.valueOf(m3.z.r(i)));
            }
            aVar = new a(2, n0Var.g());
        } else {
            aVar = new a(2, 10);
        }
        f34067d = aVar;
    }

    public a(int i, Set set) {
        this.f34068a = i;
        o0 o0VarR = o0.r(set);
        this.f34070c = o0VarR;
        q1 it = o0VarR.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.f34069b = iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f34068a == aVar.f34068a && this.f34069b == aVar.f34069b && Objects.equals(this.f34070c, aVar.f34070c);
    }

    public final int hashCode() {
        int i = ((this.f34068a * 31) + this.f34069b) * 31;
        o0 o0Var = this.f34070c;
        return i + (o0Var == null ? 0 : o0Var.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.f34068a + ", maxChannelCount=" + this.f34069b + ", channelMasks=" + this.f34070c + "]";
    }

    public a(int i, int i10) {
        this.f34068a = i;
        this.f34069b = i10;
        this.f34070c = null;
    }
}

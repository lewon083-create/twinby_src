package k3;

import ad.j0;
import com.google.android.gms.internal.measurement.h5;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f26855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f26856b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f26857c = new ByteBuffer[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f26858d;

    public g(j0 j0Var) {
        this.f26855a = j0Var;
        h hVar = h.f26859e;
        this.f26858d = false;
    }

    public final void a() {
        i iVar = i.f26864b;
        ArrayList arrayList = this.f26856b;
        arrayList.clear();
        this.f26858d = false;
        long jD = iVar.f26865a;
        int i = 0;
        while (true) {
            j0 j0Var = this.f26855a;
            if (i >= j0Var.size()) {
                break;
            }
            k kVar = (k) j0Var.get(i);
            new i(jD);
            kVar.flush();
            if (kVar.isActive()) {
                jD = kVar.d(jD);
                h5.r(jD >= 0);
                arrayList.add(kVar);
            }
            i++;
        }
        this.f26857c = new ByteBuffer[arrayList.size()];
        for (int i10 = 0; i10 <= b(); i10++) {
            this.f26857c[i10] = ((k) arrayList.get(i10)).a();
        }
    }

    public final int b() {
        return this.f26857c.length - 1;
    }

    public final boolean c() {
        return this.f26858d && ((k) this.f26856b.get(b())).isEnded() && !this.f26857c[b()].hasRemaining();
    }

    public final boolean d() {
        return !this.f26856b.isEmpty();
    }

    public final void e(ByteBuffer byteBuffer) {
        boolean z5;
        for (boolean z10 = true; z10; z10 = z5) {
            z5 = false;
            int i = 0;
            while (i <= b()) {
                if (!this.f26857c[i].hasRemaining()) {
                    ArrayList arrayList = this.f26856b;
                    k kVar = (k) arrayList.get(i);
                    if (!kVar.isEnded()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.f26857c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : k.f26866a;
                        long jRemaining = byteBuffer2.remaining();
                        kVar.b(byteBuffer2);
                        this.f26857c[i] = kVar.a();
                        z5 |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f26857c[i].hasRemaining();
                    } else if (!this.f26857c[i].hasRemaining() && i < b()) {
                        ((k) arrayList.get(i + 1)).c();
                    }
                }
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        j0 j0Var = ((g) obj).f26855a;
        j0 j0Var2 = this.f26855a;
        if (j0Var2.size() != j0Var.size()) {
            return false;
        }
        for (int i = 0; i < j0Var2.size(); i++) {
            if (j0Var2.get(i) != j0Var.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f26855a.hashCode();
    }
}

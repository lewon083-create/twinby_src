package yads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vz2 implements dg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u30 f44237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u33 f44238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f44239c;

    public vz2(p30 p30Var, u30 u30Var) {
        xf1.a();
        this.f44237a = u30Var;
        this.f44238b = new u33(p30Var);
    }

    @Override // yads.dg1
    public final void a() {
        int i;
        u33 u33Var;
        byte[] bArr;
        u33 u33Var2 = this.f44238b;
        u33Var2.f43544b = 0L;
        try {
            u33Var2.a(this.f44237a);
            do {
                i = (int) this.f44238b.f43544b;
                byte[] bArr2 = this.f44239c;
                if (bArr2 == null) {
                    this.f44239c = new byte[1024];
                } else if (i == bArr2.length) {
                    this.f44239c = Arrays.copyOf(bArr2, bArr2.length * 2);
                }
                u33Var = this.f44238b;
                bArr = this.f44239c;
            } while (u33Var.read(bArr, i, bArr.length - i) != -1);
            s30.a(this.f44238b);
        } catch (Throwable th2) {
            s30.a(this.f44238b);
            throw th2;
        }
    }

    @Override // yads.dg1
    public final void b() {
    }
}

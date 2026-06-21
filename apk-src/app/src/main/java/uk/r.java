package uk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class r implements qk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f34578a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u0 f34579b = new u0("kotlin.time.Duration", sk.d.f32923j);

    @Override // qk.a
    public final Object deserialize(tk.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        fk.a aVar = fk.b.f19468c;
        String value = decoder.j();
        aVar.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            return new fk.b(i0.o.b(value));
        } catch (IllegalArgumentException e3) {
            throw new IllegalArgumentException(pe.a.f("Invalid ISO duration string format: '", value, "'."), e3);
        }
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f34579b;
    }

    @Override // qk.a
    public final void serialize(tk.c encoder, Object obj) {
        long j10;
        long j11;
        int iG;
        long j12 = ((fk.b) obj).f19471b;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        fk.a aVar = fk.b.f19468c;
        StringBuilder sb2 = new StringBuilder();
        if (j12 < 0) {
            sb2.append('-');
        }
        sb2.append("PT");
        boolean z5 = true;
        if (j12 < 0) {
            j10 = ((-(j12 >> 1)) << 1) + ((long) (((int) j12) & 1));
            int i = fk.c.f19472a;
        } else {
            j10 = j12;
        }
        long jG = fk.b.g(j10, fk.d.f19477g);
        if (fk.b.d(j10)) {
            j11 = 0;
            iG = 0;
        } else {
            j11 = 0;
            iG = (int) (fk.b.g(j10, fk.d.f19476f) % ((long) 60));
        }
        int iG2 = fk.b.d(j10) ? 0 : (int) (fk.b.g(j10, fk.d.f19475e) % ((long) 60));
        int iC = fk.b.c(j10);
        if (fk.b.d(j12)) {
            jG = 9999999999999L;
        }
        boolean z10 = jG != j11;
        boolean z11 = (iG2 == 0 && iC == 0) ? false : true;
        if (iG == 0 && (!z11 || !z10)) {
            z5 = false;
        }
        if (z10) {
            sb2.append(jG);
            sb2.append('H');
        }
        if (z5) {
            sb2.append(iG);
            sb2.append('M');
        }
        if (z11 || (!z10 && !z5)) {
            fk.b.b(sb2, iG2, iC, 9, "S", true);
        }
        encoder.n(sb2.toString());
    }
}

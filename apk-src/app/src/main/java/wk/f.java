package wk;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.f0;
import t.t0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends j0.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d1.b f35284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0 f35285c;

    public f(d1.b lexer, vk.c json) {
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f35284b = lexer;
        this.f35285c = json.f34874b;
    }

    @Override // tk.a
    public final t0 b() {
        return this.f35285c;
    }

    @Override // j0.g, tk.b
    public final int h() {
        d1.b bVar = this.f35284b;
        String strM = bVar.m();
        try {
            return f0.c(strM);
        } catch (IllegalArgumentException unused) {
            d1.b.q(bVar, pe.a.c('\'', "Failed to parse type 'UInt' for input '", strM), 0, null, 6);
            throw null;
        }
    }

    @Override // j0.g, tk.b
    public final long o() {
        d1.b bVar = this.f35284b;
        String strM = bVar.m();
        try {
            return f0.e(strM);
        } catch (IllegalArgumentException unused) {
            d1.b.q(bVar, pe.a.c('\'', "Failed to parse type 'ULong' for input '", strM), 0, null, 6);
            throw null;
        }
    }

    @Override // tk.a
    public final int v(sk.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // j0.g, tk.b
    public final byte x() {
        d1.b bVar = this.f35284b;
        String strM = bVar.m();
        try {
            return f0.b(strM);
        } catch (IllegalArgumentException unused) {
            d1.b.q(bVar, pe.a.c('\'', "Failed to parse type 'UByte' for input '", strM), 0, null, 6);
            throw null;
        }
    }

    @Override // j0.g, tk.b
    public final short z() {
        d1.b bVar = this.f35284b;
        String strM = bVar.m();
        try {
            return f0.g(strM);
        } catch (IllegalArgumentException unused) {
            d1.b.q(bVar, pe.a.c('\'', "Failed to parse type 'UShort' for input '", strM), 0, null, 6);
            throw null;
        }
    }
}

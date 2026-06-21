package vl;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class o extends p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List f34937e = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f34938d;

    @Override // vl.p
    public final String a(String str) {
        u();
        return super.a(str);
    }

    @Override // vl.p
    public final String b(String str) {
        k3.f.v(str);
        return !(this.f34938d instanceof b) ? str.equals(o()) ? (String) this.f34938d : "" : super.b(str);
    }

    @Override // vl.p
    public final void c(String str, String str2) {
        if (!(this.f34938d instanceof b) && str.equals("#doctype")) {
            this.f34938d = str2;
        } else {
            u();
            super.c(str, str2);
        }
    }

    @Override // vl.p
    public final b d() {
        u();
        return (b) this.f34938d;
    }

    @Override // vl.p
    public final String e() {
        p pVar = this.f34939b;
        return pVar != null ? pVar.e() : "";
    }

    @Override // vl.p
    public final int f() {
        return 0;
    }

    @Override // vl.p
    public final List j() {
        return f34937e;
    }

    @Override // vl.p
    public final boolean k(String str) {
        u();
        return super.k(str);
    }

    @Override // vl.p
    public final boolean l() {
        return this.f34938d instanceof b;
    }

    public final String t() {
        return b(o());
    }

    public final void u() {
        Object obj = this.f34938d;
        if (obj instanceof b) {
            return;
        }
        b bVar = new b();
        this.f34938d = bVar;
        if (obj != null) {
            bVar.p(o(), (String) obj);
        }
    }

    @Override // vl.p
    public final void i(String str) {
    }
}

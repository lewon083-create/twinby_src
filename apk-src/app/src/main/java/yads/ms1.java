package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ms1 implements pp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pp0 f40996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k73 f40997b;

    public ms1(pp0 pp0Var, k73 k73Var) {
        this.f40996a = pp0Var;
        this.f40997b = k73Var;
    }

    @Override // yads.pp0
    public final boolean a(int i, long j10) {
        return this.f40996a.a(i, j10);
    }

    @Override // yads.pp0
    public final int b(int i) {
        return this.f40996a.b(i);
    }

    @Override // yads.pp0
    public final nx0 c() {
        return this.f40996a.c();
    }

    @Override // yads.pp0
    public final int d() {
        return this.f40996a.d();
    }

    @Override // yads.pp0
    public final void disable() {
        this.f40996a.disable();
    }

    @Override // yads.pp0
    public final int e() {
        return this.f40996a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms1)) {
            return false;
        }
        ms1 ms1Var = (ms1) obj;
        return this.f40996a.equals(ms1Var.f40996a) && this.f40997b.equals(ms1Var.f40997b);
    }

    @Override // yads.pp0
    public final int f() {
        return this.f40996a.f();
    }

    @Override // yads.pp0
    public final Object g() {
        return this.f40996a.g();
    }

    @Override // yads.pp0
    public final void h() {
        this.f40996a.h();
    }

    public final int hashCode() {
        return this.f40996a.hashCode() + ((this.f40997b.hashCode() + 527) * 31);
    }

    @Override // yads.pp0
    public final void i() {
        this.f40996a.i();
    }

    @Override // yads.pp0
    public final void a() {
        this.f40996a.a();
    }

    @Override // yads.pp0
    public final k73 b() {
        return this.f40997b;
    }

    @Override // yads.pp0
    public final int c(int i) {
        return this.f40996a.c(i);
    }

    @Override // yads.pp0
    public final int a(long j10, List list) {
        return this.f40996a.a(j10, list);
    }

    @Override // yads.pp0
    public final boolean b(int i, long j10) {
        return this.f40996a.b(i, j10);
    }

    @Override // yads.pp0
    public final nx0 a(int i) {
        return this.f40996a.a(i);
    }

    @Override // yads.pp0
    public final int a(nx0 nx0Var) {
        return this.f40996a.a(nx0Var);
    }

    @Override // yads.pp0
    public final void a(boolean z5) {
        this.f40996a.a(z5);
    }

    @Override // yads.pp0
    public final void a(float f10) {
        this.f40996a.a(f10);
    }

    @Override // yads.pp0
    public final boolean a(long j10, cu cuVar, List list) {
        return this.f40996a.a(j10, cuVar, list);
    }

    @Override // yads.pp0
    public final void a(long j10, long j11, long j12, List list, ak1[] ak1VarArr) {
        this.f40996a.a(j10, j11, j12, list, ak1VarArr);
    }
}

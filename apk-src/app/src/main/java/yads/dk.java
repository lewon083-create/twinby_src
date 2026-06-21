package yads;

import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class dk implements ak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lb2 f37787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37791e;

    public dk(wj wjVar) {
        lb2 lb2Var = wjVar.f44413b;
        this.f37787a = lb2Var;
        lb2Var.e(12);
        this.f37789c = lb2Var.p() & KotlinVersion.MAX_COMPONENT_VALUE;
        this.f37788b = lb2Var.p();
    }

    @Override // yads.ak
    public final int a() {
        return -1;
    }

    @Override // yads.ak
    public final int b() {
        return this.f37788b;
    }

    @Override // yads.ak
    public final int c() {
        int i = this.f37789c;
        if (i == 8) {
            return this.f37787a.m();
        }
        if (i == 16) {
            return this.f37787a.r();
        }
        int i10 = this.f37790d;
        this.f37790d = i10 + 1;
        if (i10 % 2 != 0) {
            return this.f37791e & 15;
        }
        int iM = this.f37787a.m();
        this.f37791e = iM;
        return (iM & 240) >> 4;
    }
}

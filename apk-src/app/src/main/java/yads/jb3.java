package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class jb3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f39818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p73[] f39819b;

    public jb3(List list) {
        this.f39818a = list;
        this.f39819b = new p73[list.size()];
    }

    public final void a(qq0 qq0Var, o93 o93Var) {
        for (int i = 0; i < this.f39819b.length; i++) {
            o93Var.a();
            o93Var.b();
            p73 p73VarA = qq0Var.a(o93Var.f41501d, 3);
            nx0 nx0Var = (nx0) this.f39818a.get(i);
            String str = nx0Var.f41375m;
            ni.a("Invalid closed caption mime type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            mx0 mx0Var = new mx0();
            o93Var.b();
            mx0Var.f41066a = o93Var.f41502e;
            mx0Var.f41075k = str;
            mx0Var.f41069d = nx0Var.f41368e;
            mx0Var.f41068c = nx0Var.f41367d;
            mx0Var.C = nx0Var.E;
            mx0Var.f41077m = nx0Var.f41377o;
            p73VarA.a(new nx0(mx0Var));
            this.f39819b[i] = p73VarA;
        }
    }
}

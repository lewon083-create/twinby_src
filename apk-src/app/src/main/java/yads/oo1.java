package yads;

import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class oo1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f41666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gp1 f41667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final to1 f41668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final io1 f41669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f41670e;

    public oo1(List list, gp1 gp1Var, to1 to1Var, io1 io1Var) {
        this.f41666a = list;
        this.f41667b = gp1Var;
        this.f41668c = to1Var;
        this.f41669d = io1Var;
    }

    public final eo1 a(Context context, Class cls) {
        while (this.f41670e < this.f41666a.size()) {
            List list = this.f41666a;
            int i = this.f41670e;
            this.f41670e = i + 1;
            this.f41668c.a(context, (sq1) list.get(i), cls);
        }
        return null;
    }

    public /* synthetic */ oo1(List list, gp1 gp1Var, zo1 zo1Var) {
        this(list, gp1Var, new to1(zo1Var), new io1());
    }
}

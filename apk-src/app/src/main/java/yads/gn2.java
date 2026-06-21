package yads;

import android.os.SystemClock;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gn2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e9 f38833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hn2 f38834c;

    public gn2(hn2 hn2Var, e9 e9Var) {
        this.f38834c = hn2Var;
        this.f38833b = e9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List listF;
        pi piVarA;
        String str;
        tn1 tn1VarD;
        if (this.f38834c.f39257d) {
            return;
        }
        e9 e9Var = this.f38833b;
        if (e9Var.f38045a.a()) {
            v12 v12Var = e9Var.f38046b;
            v12Var.f43850c.getClass();
            pt2 pt2VarA = v12Var.f43851d.a(v12Var.f43848a);
            if (pt2VarA == null || !pt2VarA.A || (((py1) v12Var.f43849b).a(false) instanceof ub3)) {
                hn2 hn2Var = this.f38834c;
                hn2Var.f39257d = true;
                kn2 kn2Var = hn2Var.f39255b;
                mn2 mn2Var = kn2Var.f40292c;
                if (mn2Var != null) {
                    mn2Var.f40972a = Long.valueOf(SystemClock.elapsedRealtime());
                }
                jn2 jn2Var = kn2Var.f40293d;
                Iterator it = jn2Var.f39918a.iterator();
                while (it.hasNext()) {
                    za.a(jn2Var.f39919b, (String) it.next(), n83.i);
                }
                in2 in2Var = jn2Var.f39920c;
                ho2 ho2VarA = in2Var.f39594f.a(in2Var.f39590b, in2Var.f39589a);
                ho2VarA.b(do2.f37869a, "adapter");
                o42 o42Var = in2Var.f39595g;
                if (o42Var != null) {
                    Map map = o42Var.f41465a.a().f39286a;
                    nj njVar = o42Var.f41466b;
                    njVar.getClass();
                    HashMap map2 = new HashMap();
                    for (oi oiVar : njVar.f41257a) {
                        String str2 = oiVar.f41540a;
                        n12 n12Var = njVar.f41258b;
                        if (n12Var != null && (piVarA = n12Var.a(oiVar)) != null && piVarA.b()) {
                            HashMap map3 = new HashMap();
                            cl3 cl3VarC = piVarA.c();
                            if (cl3VarC != null) {
                                map3.put("width", Integer.valueOf(ia3.a(cl3VarC.f37435a)));
                                map3.put("height", Integer.valueOf(ia3.a(cl3VarC.f37436b)));
                            }
                            tj1 tj1Var = piVarA instanceof tj1 ? (tj1) piVarA : null;
                            if (tj1Var != null) {
                                un1 un1Var = tj1Var.f43343b;
                                tn1 tn1Var = (un1Var == null || (tn1VarD = un1Var.d()) == null) ? tj1Var.f43342a != null ? tn1.f43378f : null : tn1VarD;
                                if (tn1Var != null && (str = tn1Var.f43381b) != null) {
                                    map3.put("value_type", str);
                                }
                            }
                            map2.put(str2, map3);
                        }
                    }
                    n12 n12Var2 = njVar.f41258b;
                    View viewA = n12Var2 != null ? n12Var2.f41135c.a() : null;
                    jj.i builder = new jj.i();
                    if (viewA != null) {
                        builder.put("width", Integer.valueOf(ia3.a(viewA.getWidth())));
                        builder.put("height", Integer.valueOf(ia3.a(viewA.getHeight())));
                    }
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    jj.i iVarB = builder.b();
                    if (!iVarB.isEmpty()) {
                        map2.put("superview", iVarB);
                    }
                    ho2VarA.f39286a.putAll(kotlin.collections.j0.i(map, kotlin.collections.i0.c(new Pair("assets", kotlin.collections.i0.c(new Pair("rendered", map2))))));
                }
                d03 d03Var = in2Var.f39589a.f37616d.f37951a;
                if (d03Var != null) {
                    ho2VarA.b(d03Var.b().f37246b, "size_type");
                    ho2VarA.b(Integer.valueOf(d03Var.getWidth()), "width");
                    ho2VarA.b(Integer.valueOf(d03Var.getHeight()), "height");
                }
                pt2 pt2Var = in2Var.f39593e;
                if (pt2Var != null) {
                    ho2VarA.b(pt2Var.O, "banner_size_calculation_type");
                }
                int iOrdinal = in2Var.f39591c.ordinal();
                if (iOrdinal == 0) {
                    listF = kotlin.collections.s.f(eo2.f38204n, eo2.f38203m);
                } else if (iOrdinal == 1) {
                    listF = kotlin.collections.r.c(eo2.f38204n);
                } else {
                    if (iOrdinal != 2) {
                        throw new ij.j();
                    }
                    listF = kotlin.collections.r.c(eo2.f38203m);
                }
                Iterator it2 = listF.iterator();
                while (it2.hasNext()) {
                    in2Var.f39592d.a(new go2(((eo2) it2.next()).f38217b, kotlin.collections.j0.m(ho2VarA.f39286a), ho2VarA.f39287b));
                }
                f5 f5Var = kn2Var.f40290a;
                String str3 = f5Var.f38381a.f38612a;
                if (str3 != null && str3.length() != 0) {
                    e5 e5Var = f5Var.f38382b;
                    e5Var.getClass();
                    synchronized (e5.f38010c) {
                        e5Var.f38012a.remove(str3);
                        e5Var.f38012a.add(str3);
                    }
                }
                kn2Var.f40291b.f();
                return;
            }
        }
        hn2 hn2Var2 = this.f38834c;
        hn2Var2.f39256c.postDelayed(new gn2(hn2Var2, this.f38833b), 300L);
    }
}

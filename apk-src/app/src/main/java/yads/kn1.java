package yads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import yads.mo;
import yads.v63;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class kn1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final af2 f40279a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jn1 f40283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final dn1 f40284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final pk0 f40285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f40286h;
    public final HashSet i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f40288k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public u83 f40289l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public vy2 f40287j = new vy2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IdentityHashMap f40281c = new IdentityHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f40282d = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f40280b = new ArrayList();

    public kn1(jn1 jn1Var, se seVar, Handler handler, af2 af2Var) {
        this.f40279a = af2Var;
        this.f40283e = jn1Var;
        dn1 dn1Var = new dn1();
        this.f40284f = dn1Var;
        pk0 pk0Var = new pk0();
        this.f40285g = pk0Var;
        this.f40286h = new HashMap();
        this.i = new HashSet();
        dn1Var.a(handler, seVar);
        pk0Var.a(handler, seVar);
    }

    public final v63 a(int i, List list, vy2 vy2Var) {
        if (!list.isEmpty()) {
            this.f40287j = vy2Var;
            for (int i10 = i; i10 < list.size() + i; i10++) {
                in1 in1Var = (in1) list.get(i10 - i);
                if (i10 > 0) {
                    in1 in1Var2 = (in1) this.f40280b.get(i10 - 1);
                    in1Var.f39587d = in1Var2.f39584a.f44721o.f42417c.b() + in1Var2.f39587d;
                    in1Var.f39588e = false;
                    in1Var.f39586c.clear();
                } else {
                    in1Var.f39587d = 0;
                    in1Var.f39588e = false;
                    in1Var.f39586c.clear();
                }
                int iB = in1Var.f39584a.f44721o.f42417c.b();
                for (int i11 = i10; i11 < this.f40280b.size(); i11++) {
                    ((in1) this.f40280b.get(i11)).f39587d += iB;
                }
                this.f40280b.add(i10, in1Var);
                this.f40282d.put(in1Var.f39585b, in1Var);
                if (this.f40288k) {
                    a(in1Var);
                    if (this.f40281c.isEmpty()) {
                        this.i.add(in1Var);
                    } else {
                        hn1 hn1Var = (hn1) this.f40286h.get(in1Var);
                        if (hn1Var != null) {
                            hn1Var.f39251a.a(hn1Var.f39252b);
                        }
                    }
                }
            }
        }
        return a();
    }

    public final v63 a() {
        if (this.f40280b.isEmpty()) {
            return v63.f43913b;
        }
        int iB = 0;
        for (int i = 0; i < this.f40280b.size(); i++) {
            in1 in1Var = (in1) this.f40280b.get(i);
            in1Var.f39587d = iB;
            iB += in1Var.f39584a.f44721o.f42417c.b();
        }
        return new zf2(this.f40280b, this.f40287j);
    }

    public final void a(mo moVar, v63 v63Var) {
        ((ho0) this.f40283e).i.f40427a.sendEmptyMessage(22);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(in1 in1Var) {
        xi1 xi1Var = in1Var.f39584a;
        bn1 bn1Var = new bn1() { // from class: zl.m0
            @Override // yads.bn1
            public final void a(mo moVar, v63 v63Var) {
                this.f46615a.a(moVar, v63Var);
            }
        };
        gn1 gn1Var = new gn1(this, in1Var);
        this.f40286h.put(in1Var, new hn1(xi1Var, bn1Var, gn1Var));
        Handler handlerB = lb3.b((Handler.Callback) null);
        xi1Var.getClass();
        dn1 dn1Var = xi1Var.f40975c;
        dn1Var.getClass();
        dn1Var.f37847c.add(new cn1(handlerB, gn1Var));
        Handler handlerB2 = lb3.b((Handler.Callback) null);
        pk0 pk0Var = xi1Var.f40976d;
        pk0Var.getClass();
        pk0Var.f41946c.add(new ok0(handlerB2, gn1Var));
        u83 u83Var = this.f40289l;
        af2 af2Var = this.f40279a;
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = xi1Var.f40977e;
        if (looper != null && looper != looperMyLooper) {
            throw new IllegalArgumentException();
        }
        xi1Var.f40979g = af2Var;
        v63 v63Var = xi1Var.f40978f;
        xi1Var.f40973a.add(bn1Var);
        if (xi1Var.f40977e == null) {
            xi1Var.f40977e = looperMyLooper;
            xi1Var.f40974b.add(bn1Var);
            xi1Var.a(u83Var);
        } else if (v63Var != null) {
            xi1Var.b(bn1Var);
            bn1Var.a(xi1Var, v63Var);
        }
    }

    public final void a(int i, int i10) {
        for (int i11 = i10 - 1; i11 >= i; i11--) {
            in1 in1Var = (in1) this.f40280b.remove(i11);
            this.f40282d.remove(in1Var.f39585b);
            int i12 = -in1Var.f39584a.f44721o.f42417c.b();
            for (int i13 = i11; i13 < this.f40280b.size(); i13++) {
                ((in1) this.f40280b.get(i13)).f39587d += i12;
            }
            in1Var.f39588e = true;
            if (this.f40288k && in1Var.f39586c.isEmpty()) {
                hn1 hn1Var = (hn1) this.f40286h.remove(in1Var);
                hn1Var.getClass();
                hn1Var.f39251a.c(hn1Var.f39252b);
                hn1Var.f39251a.a((en1) hn1Var.f39253c);
                hn1Var.f39251a.a((qk0) hn1Var.f39253c);
                this.i.remove(in1Var);
            }
        }
    }
}

package ja;

import ad.m0;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import fh.nd;
import ka.h;
import ka.j;
import na.f;
import na.n;
import na.o;
import oa.r;
import ob.a0;
import pa.c0;
import pa.u;
import sb.g;
import sb.m;
import ya.d;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final nd f26581m = new nd();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f26582n = 1;

    public final Intent f() {
        int i = i();
        int i10 = i - 1;
        if (i == 0) {
            throw null;
        }
        na.b bVar = this.f29194f;
        Context context = this.f29190b;
        if (i10 == 2) {
            j.f27321a.h("getFallbackSignInIntent()", new Object[0]);
            Intent intentA = j.a(context, (GoogleSignInOptions) bVar);
            intentA.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
            return intentA;
        }
        if (i10 == 3) {
            return j.a(context, (GoogleSignInOptions) bVar);
        }
        j.f27321a.h("getNoImplementationSignInIntent()", new Object[0]);
        Intent intentA2 = j.a(context, (GoogleSignInOptions) bVar);
        intentA2.setAction("com.google.android.gms.auth.NO_IMPL");
        return intentA2;
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
    public final m g() {
        BasePendingResult basePendingResult;
        int i = 1;
        boolean z5 = i() == 3;
        j.f27321a.h("Revoking access", new Object[0]);
        Context context = this.f29190b;
        String strE = ka.b.a(context).e("refreshToken");
        j.b(context);
        if (!z5) {
            r rVar = this.f29197j;
            h hVar = new h(rVar, i);
            rVar.f29884b.d(1, hVar);
            basePendingResult = hVar;
        } else if (strE == null) {
            m0 m0Var = ka.c.f27304d;
            Status status = new Status(4, null, null, null);
            c0.a("Status code must not be SUCCESS", !status.c());
            n nVar = new n(status);
            nVar.G(status);
            basePendingResult = nVar;
        } else {
            ka.c cVar = new ka.c(strE);
            new Thread(cVar).start();
            basePendingResult = cVar.f27306c;
        }
        a0 a0Var = new a0(23);
        g gVar = new g();
        basePendingResult.C(new u(basePendingResult, gVar, a0Var));
        return gVar.f32858a;
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
    public final m h() {
        BasePendingResult basePendingResult;
        boolean z5 = i() == 3;
        j.f27321a.h("Signing out", new Object[0]);
        j.b(this.f29190b);
        r rVar = this.f29197j;
        if (z5) {
            o oVar = new o(rVar, 1);
            oVar.G(Status.f2629f);
            basePendingResult = oVar;
        } else {
            h hVar = new h(rVar, 0);
            rVar.f29884b.d(1, hVar);
            basePendingResult = hVar;
        }
        a0 a0Var = new a0(23);
        g gVar = new g();
        basePendingResult.C(new u(basePendingResult, gVar, a0Var));
        return gVar.f32858a;
    }

    public final synchronized int i() {
        int i;
        try {
            i = f26582n;
            if (i == 1) {
                Context context = this.f29190b;
                ma.f fVar = ma.f.f28773d;
                int iC = fVar.c(context, 12451000);
                if (iC == 0) {
                    i = 4;
                    f26582n = 4;
                } else if (fVar.b(context, null, iC) != null || d.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                    i = 2;
                    f26582n = 2;
                } else {
                    i = 3;
                    f26582n = 3;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return i;
    }
}

package wi;

import ad.m0;
import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.tasks.Task;
import fj.w0;
import ii.s;
import io.sentry.SentryEvent;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import ka.j;
import pa.c0;
import t.t0;
import t.x1;
import t.z;
import t9.h0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f35253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Activity f35254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ja.a f35255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f35256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public x1 f35257f;

    public b(Context context, h0 h0Var) {
        this.f35253b = context;
    }

    public static boolean f(String str) {
        return str == null || str.isEmpty();
    }

    public static void i(ii.f fVar, b bVar) {
        t0 t0VarA = fVar.a();
        f fVar2 = f.f35269a;
        s7.g gVar = new s7.g(fVar, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.init", fVar2, (Object) null);
        if (bVar != null) {
            gVar.L(new a(bVar, 3));
        } else {
            gVar.L(null);
        }
        s7.g gVar2 = new s7.g(fVar, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.signInSilently", fVar2, (Object) null);
        if (bVar != null) {
            gVar2.L(new a(bVar, 4));
        } else {
            gVar2.L(null);
        }
        s7.g gVar3 = new s7.g(fVar, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.signIn", fVar2, (Object) null);
        if (bVar != null) {
            gVar3.L(new a(bVar, 5));
        } else {
            gVar3.L(null);
        }
        s7.g gVar4 = new s7.g(fVar, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.getAccessToken", fVar2, t0VarA);
        if (bVar != null) {
            gVar4.L(new a(bVar, 6));
        } else {
            gVar4.L(null);
        }
        s7.g gVar5 = new s7.g(fVar, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.signOut", fVar2, (Object) null);
        if (bVar != null) {
            gVar5.L(new a(bVar, 7));
        } else {
            gVar5.L(null);
        }
        s7.g gVar6 = new s7.g(fVar, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.disconnect", fVar2, (Object) null);
        if (bVar != null) {
            gVar6.L(new a(bVar, 8));
        } else {
            gVar6.L(null);
        }
        s7.g gVar7 = new s7.g(fVar, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.isSignedIn", fVar2, (Object) null);
        if (bVar != null) {
            gVar7.L(new a(bVar, 9));
        } else {
            gVar7.L(null);
        }
        s7.g gVar8 = new s7.g(fVar, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.clearAuthCache", fVar2, t0VarA);
        if (bVar != null) {
            gVar8.L(new a(bVar, 10));
        } else {
            gVar8.L(null);
        }
        s7.g gVar9 = new s7.g(fVar, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.requestScopes", fVar2, (Object) null);
        if (bVar != null) {
            gVar9.L(new a(bVar, 11));
        } else {
            gVar9.L(null);
        }
    }

    @Override // ii.s
    public final boolean a(int i, int i10, Intent intent) {
        ja.c cVar;
        GoogleSignInAccount googleSignInAccount;
        x1 x1Var = this.f35257f;
        if (x1Var != null) {
            switch (i) {
                case 53293:
                    if (intent == null) {
                        c("sign_in_failed", "Signin failed");
                        return true;
                    }
                    m0 m0Var = j.f27321a;
                    Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
                    GoogleSignInAccount googleSignInAccount2 = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
                    if (googleSignInAccount2 == null) {
                        if (status == null) {
                            status = Status.f2631h;
                        }
                        cVar = new ja.c(null, status);
                    } else {
                        cVar = new ja.c(googleSignInAccount2, Status.f2629f);
                    }
                    Status status2 = cVar.f26591b;
                    h((!status2.c() || (googleSignInAccount = cVar.f26592c) == null) ? b4.q(c0.n(status2)) : b4.s(googleSignInAccount));
                    return true;
                case 53294:
                    if (i10 != -1) {
                        c("failed_to_recover_auth", "Failed attempt to recover authentication");
                        return true;
                    }
                    jh.b bVar = (jh.b) x1Var.f33321f;
                    Objects.requireNonNull(bVar);
                    Object obj = this.f35257f.f33322g;
                    Objects.requireNonNull(obj);
                    this.f35257f = null;
                    d((String) obj, Boolean.FALSE, bVar);
                    return true;
                case 53295:
                    Boolean boolValueOf = Boolean.valueOf(i10 == -1);
                    jh.b bVar2 = (jh.b) this.f35257f.f33320e;
                    Objects.requireNonNull(bVar2);
                    bVar2.e(boolValueOf);
                    this.f35257f = null;
                    return true;
            }
        }
        return false;
    }

    public final void b(String str, jh.b bVar, jh.b bVar2, jh.b bVar3, jh.b bVar4, Object obj) {
        if (this.f35257f != null) {
            throw new IllegalStateException(z.g(new StringBuilder("Concurrent operations detected: "), (String) this.f35257f.f33317b, ", ", str));
        }
        this.f35257f = new x1(str, bVar, bVar2, bVar3, bVar4, obj);
    }

    public final void c(String str, String str2) {
        x1 x1Var = this.f35257f;
        jh.b bVar = (jh.b) x1Var.f33319d;
        if (bVar != null) {
            bVar.b(new d(str, str2));
        } else {
            jh.b bVar2 = (jh.b) x1Var.f33318c;
            if (bVar2 == null && (bVar2 = (jh.b) x1Var.f33320e) == null) {
                bVar2 = (jh.b) x1Var.f33321f;
            }
            Objects.requireNonNull(bVar2);
            bVar2.b(new d(str, str2));
        }
        this.f35257f = null;
    }

    public final void d(String str, Boolean bool, jh.b bVar) {
        try {
            bVar.e(ha.a.b(this.f35253b, new Account(str, "com.google"), "oauth2:" + pe.a.e(this.f35256e)));
        } catch (UserRecoverableAuthException e3) {
            new Handler(Looper.getMainLooper()).post(new w0(this, bool, bVar, e3, str));
        } catch (Exception e7) {
            bVar.b(new d(SentryEvent.JsonKeys.EXCEPTION, e7.getMessage()));
        }
    }

    public final void e(e eVar) {
        ja.b bVar;
        int identifier;
        try {
            int iOrdinal = eVar.f35263b.ordinal();
            if (iOrdinal == 0) {
                bVar = new ja.b(GoogleSignInOptions.f2599l);
                bVar.f26583a.add(GoogleSignInOptions.f2601n);
            } else {
                if (iOrdinal != 1) {
                    throw new IllegalStateException("Unknown signInOption");
                }
                bVar = new ja.b(GoogleSignInOptions.f2600m);
            }
            String string = eVar.f35266e;
            if (!f(eVar.f35265d) && f(string)) {
                Log.w("google_sign_in", "clientId is not supported on Android and is interpreted as serverClientId. Use serverClientId instead to suppress this warning.");
                string = eVar.f35265d;
            }
            boolean zF = f(string);
            Context context = this.f35253b;
            if (zF && (identifier = context.getResources().getIdentifier("default_web_client_id", "string", context.getPackageName())) != 0) {
                string = context.getString(identifier);
            }
            if (!f(string)) {
                bVar.f26586d = true;
                c0.f(string);
                String str = bVar.f26587e;
                c0.a("two different server client ids provided", str == null || str.equals(string));
                bVar.f26587e = string;
                boolean zBooleanValue = eVar.f35267f.booleanValue();
                bVar.f26584b = true;
                c0.f(string);
                String str2 = bVar.f26587e;
                c0.a("two different server client ids provided", str2 == null || str2.equals(string));
                bVar.f26587e = string;
                bVar.f26585c = zBooleanValue;
            }
            List list = eVar.f35262a;
            this.f35256e = list;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Scope scope = new Scope(1, (String) it.next());
                HashSet hashSet = bVar.f26583a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
            if (!f(eVar.f35264c)) {
                String str3 = eVar.f35264c;
                c0.f(str3);
                bVar.f26589g = str3;
            }
            String str4 = eVar.f35268g;
            if (!f(str4)) {
                c0.f(str4);
                bVar.f26588f = new Account(str4, "com.google");
            }
            this.f35255d = new ja.a(context, null, ia.a.f21224a, bVar.a(), new na.e(new le.a(10), Looper.getMainLooper()));
        } catch (Exception e3) {
            throw new d(SentryEvent.JsonKeys.EXCEPTION, e3.getMessage());
        }
    }

    public final void g(GoogleSignInAccount googleSignInAccount) {
        String str = googleSignInAccount.f2590d;
        String str2 = googleSignInAccount.f2588b;
        String str3 = googleSignInAccount.f2589c;
        String str4 = googleSignInAccount.f2593g;
        String str5 = googleSignInAccount.f2591e;
        Uri uri = googleSignInAccount.f2592f;
        String string = uri != null ? uri.toString() : null;
        h hVar = new h();
        hVar.f35272a = str5;
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"email\" is null.");
        }
        hVar.f35273b = str;
        if (str2 == null) {
            throw new IllegalStateException("Nonnull field \"id\" is null.");
        }
        hVar.f35274c = str2;
        hVar.f35275d = string;
        hVar.f35276e = str3;
        hVar.f35277f = str4;
        jh.b bVar = (jh.b) this.f35257f.f33318c;
        Objects.requireNonNull(bVar);
        bVar.e(hVar);
        this.f35257f = null;
    }

    public final void h(Task task) {
        try {
            g((GoogleSignInAccount) task.g(na.d.class));
        } catch (na.d e3) {
            int i = e3.f29186b.f2633b;
            c(i != 4 ? i != 7 ? i != 12501 ? "sign_in_failed" : "sign_in_canceled" : "network_error" : "sign_in_required", e3.toString());
        } catch (sb.e e7) {
            c(SentryEvent.JsonKeys.EXCEPTION, e7.toString());
        }
    }
}

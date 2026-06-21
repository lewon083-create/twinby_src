package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.lifecycle.z0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;
import f3.a;
import h1.j;
import h3.b;
import h3.c;
import h3.d;
import java.lang.reflect.Modifier;
import java.util.Set;
import ka.k;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.i;
import s7.g;
import v7.f;
import z2.w;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class SignInHubActivity extends w {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static boolean f2620m = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2621h = false;
    public SignInConfiguration i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2622j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2623k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Intent f2624l;

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
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
    public final void k() {
        z0 store = getViewModelStore();
        c factory = d.f20370d;
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        a defaultCreationExtras = a.f16575b;
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        g gVar = new g(store, factory, defaultCreationExtras);
        Intrinsics.checkNotNullParameter(d.class, "modelClass");
        Intrinsics.checkNotNullParameter(d.class, "<this>");
        i modelClass = g0.a(d.class);
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String strB = modelClass.b();
        if (strB == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        d dVar = (d) gVar.C(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        f fVar = new f(29, this);
        boolean z5 = dVar.f20372c;
        j jVar = dVar.f20371b;
        if (z5) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        h3.a aVar = (h3.a) jVar.b(0);
        if (aVar == null) {
            try {
                dVar.f20372c = true;
                Set set = na.i.f29200a;
                synchronized (set) {
                }
                ka.d dVar2 = new ka.d(this, set);
                if (ka.d.class.isMemberClass() && !Modifier.isStatic(ka.d.class.getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + dVar2);
                }
                h3.a aVar2 = new h3.a(dVar2);
                jVar.c(0, aVar2);
                dVar.f20372c = false;
                b bVar = new b(aVar2.f20364n, fVar);
                aVar2.e(this, bVar);
                b bVar2 = aVar2.f20366p;
                if (bVar2 != null) {
                    aVar2.j(bVar2);
                }
                aVar2.f20365o = this;
                aVar2.f20366p = bVar;
            } catch (Throwable th2) {
                dVar.f20372c = false;
                throw th2;
            }
        } else {
            b bVar3 = new b(aVar.f20364n, fVar);
            aVar.e(this, bVar3);
            b bVar4 = aVar.f20366p;
            if (bVar4 != null) {
                aVar.j(bVar4);
            }
            aVar.f20365o = this;
            aVar.f20366p = bVar3;
        }
        f2620m = false;
    }

    public final void l(int i) {
        Status status = new Status(i, null, null, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f2620m = false;
    }

    @Override // z2.w, d.n, android.app.Activity
    public final void onActivityResult(int i, int i10, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.f2621h) {
            return;
        }
        setResult(0);
        if (i != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.f2616c) != null) {
                k kVarT = k.T(this);
                GoogleSignInOptions googleSignInOptions = this.i.f2619c;
                synchronized (kVarT) {
                    ((ka.b) kVarT.f27324c).c(googleSignInAccount, googleSignInOptions);
                    kVarT.f27325d = googleSignInAccount;
                    kVarT.f27326e = googleSignInOptions;
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.f2622j = true;
                this.f2623k = i10;
                this.f2624l = intent;
                k();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                l(intExtra);
                return;
            }
        }
        l(8);
    }

    @Override // z2.w, d.n, t1.d, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        action.getClass();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            l(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        bundleExtra.getClass();
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.i = signInConfiguration;
        if (bundle != null) {
            boolean z5 = bundle.getBoolean("signingInGoogleApiClients");
            this.f2622j = z5;
            if (z5) {
                this.f2623k = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                intent2.getClass();
                this.f2624l = intent2;
                k();
                return;
            }
            return;
        }
        if (f2620m) {
            setResult(0);
            l(12502);
            return;
        }
        f2620m = true;
        Intent intent3 = new Intent(action);
        if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent3.setPackage("com.google.android.gms");
        } else {
            intent3.setPackage(getPackageName());
        }
        intent3.putExtra("config", this.i);
        try {
            startActivityForResult(intent3, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f2621h = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            l(17);
        }
    }

    @Override // z2.w, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f2620m = false;
    }

    @Override // d.n, t1.d, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f2622j);
        if (this.f2622j) {
            bundle.putInt("signInResultCode", this.f2623k);
            bundle.putParcelable("signInResultData", this.f2624l);
        }
    }
}

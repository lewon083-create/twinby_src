package ja;

import android.accounts.Account;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import pa.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f26583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f26585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f26586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f26587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Account f26588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f26589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f26590h;
    public String i;

    public b() {
        this.f26583a = new HashSet();
        this.f26590h = new HashMap();
    }

    public final GoogleSignInOptions a() {
        Scope scope = GoogleSignInOptions.f2604q;
        HashSet hashSet = this.f26583a;
        if (hashSet.contains(scope)) {
            Scope scope2 = GoogleSignInOptions.f2603p;
            if (hashSet.contains(scope2)) {
                hashSet.remove(scope2);
            }
        }
        if (this.f26586d && (this.f26588f == null || !hashSet.isEmpty())) {
            hashSet.add(GoogleSignInOptions.f2602o);
        }
        return new GoogleSignInOptions(3, new ArrayList(hashSet), this.f26588f, this.f26586d, this.f26584b, this.f26585c, this.f26587e, this.f26589g, this.f26590h, this.i);
    }

    public b(GoogleSignInOptions googleSignInOptions) {
        this.f26583a = new HashSet();
        this.f26590h = new HashMap();
        c0.i(googleSignInOptions);
        this.f26583a = new HashSet(googleSignInOptions.f2607c);
        this.f26584b = googleSignInOptions.f2610f;
        this.f26585c = googleSignInOptions.f2611g;
        this.f26586d = googleSignInOptions.f2609e;
        this.f26587e = googleSignInOptions.f2612h;
        this.f26588f = googleSignInOptions.f2608d;
        this.f26589g = googleSignInOptions.i;
        this.f26590h = GoogleSignInOptions.c(googleSignInOptions.f2613j);
        this.i = googleSignInOptions.f2614k;
    }
}

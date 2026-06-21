package h3;

import androidx.lifecycle.e0;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import v7.f;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f20367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20368b = false;

    public b(ka.d dVar, f fVar) {
        this.f20367a = fVar;
    }

    @Override // androidx.lifecycle.e0
    public final void a(Object obj) {
        this.f20368b = true;
        f fVar = this.f20367a;
        fVar.getClass();
        SignInHubActivity signInHubActivity = (SignInHubActivity) fVar.f34767c;
        signInHubActivity.setResult(signInHubActivity.f2623k, signInHubActivity.f2624l);
        signInHubActivity.finish();
    }

    public final String toString() {
        return this.f20367a.toString();
    }
}

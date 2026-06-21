package ja;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import na.l;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Status f26591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GoogleSignInAccount f26592c;

    public c(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f26592c = googleSignInAccount;
        this.f26591b = status;
    }

    @Override // na.l
    public final Status getStatus() {
        return this.f26591b;
    }
}

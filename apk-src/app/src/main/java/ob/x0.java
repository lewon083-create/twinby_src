package ob;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f30505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f30506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f30507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z0 f30508e;

    public x0(z0 z0Var, String str, boolean z5) {
        this.f30508e = z0Var;
        pa.c0.f(str);
        this.f30504a = str;
        this.f30505b = z5;
    }

    public final boolean a() {
        if (!this.f30506c) {
            this.f30506c = true;
            this.f30507d = this.f30508e.G().getBoolean(this.f30504a, this.f30505b);
        }
        return this.f30507d;
    }

    public final void b(boolean z5) {
        SharedPreferences.Editor editorEdit = this.f30508e.G().edit();
        editorEdit.putBoolean(this.f30504a, z5);
        editorEdit.apply();
        this.f30507d = z5;
    }
}

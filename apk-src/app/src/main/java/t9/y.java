package t9;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f33658b;

    public y(a0 a0Var, String str) {
        Objects.requireNonNull(a0Var);
        this.f33658b = a0Var;
        this.f33657a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        a0 a0Var = this.f33658b;
        synchronized (a0Var) {
            try {
                for (z zVar : a0Var.f33544b) {
                    String str2 = this.f33657a;
                    HashMap map = zVar.f33659a;
                    if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str)) {
                        p9.k.C.f31302h.g().u(false);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

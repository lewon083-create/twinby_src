package z2;

import android.util.Log;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends w0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h3.c f45877h = new h3.c(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f45881e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f45878b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f45879c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f45880d = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f45882f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f45883g = false;

    public j0(boolean z5) {
        this.f45881e = z5;
    }

    @Override // androidx.lifecycle.w0
    public final void b() {
        if (h0.K(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f45882f = true;
    }

    public final void c(String str, boolean z5) {
        if (h0.K(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        e(str, z5);
    }

    public final void d(t tVar, boolean z5) {
        if (h0.K(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + tVar);
        }
        e(tVar.f45972f, z5);
    }

    public final void e(String str, boolean z5) {
        HashMap map = this.f45879c;
        j0 j0Var = (j0) map.get(str);
        if (j0Var != null) {
            if (z5) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(j0Var.f45879c.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    j0Var.c((String) it.next(), true);
                }
            }
            j0Var.b();
            map.remove(str);
        }
        HashMap map2 = this.f45880d;
        z0 z0Var = (z0) map2.get(str);
        if (z0Var != null) {
            z0Var.a();
            map2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j0.class == obj.getClass()) {
            j0 j0Var = (j0) obj;
            if (this.f45878b.equals(j0Var.f45878b) && this.f45879c.equals(j0Var.f45879c) && this.f45880d.equals(j0Var.f45880d)) {
                return true;
            }
        }
        return false;
    }

    public final void f(t tVar) {
        if (this.f45883g) {
            if (h0.K(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f45878b.remove(tVar.f45972f) == null || !h0.K(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + tVar);
        }
    }

    public final int hashCode() {
        return this.f45880d.hashCode() + ((this.f45879c.hashCode() + (this.f45878b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator it = this.f45878b.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator it2 = this.f45879c.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append((String) it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator it3 = this.f45880d.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append((String) it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}

package yads;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vg1 implements tg1, SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ry2 f44029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f44030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ij.g f44031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f44032e;

    public vg1(Context context, String str, ry2 ry2Var) {
        this.f44028a = str;
        this.f44029b = ry2Var;
        Context applicationContext = context.getApplicationContext();
        this.f44030c = applicationContext != null ? applicationContext : context;
        this.f44031d = ij.h.b(new ug1(this));
        this.f44032e = new LinkedHashSet();
    }

    public final void a() {
        ((SharedPreferences) this.f44031d.getValue()).edit().clear().apply();
    }

    public final long b(String str) {
        return ((SharedPreferences) this.f44031d.getValue()).getLong(str, 0L);
    }

    public final String c(String str) {
        return ((SharedPreferences) this.f44031d.getValue()).getString(str, null);
    }

    public final void d(String str) {
        ((SharedPreferences) this.f44031d.getValue()).edit().remove(str).apply();
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str != null) {
            Iterator it = this.f44032e.iterator();
            while (it.hasNext()) {
                sg1 sg1Var = (sg1) ((WeakReference) it.next()).get();
                if (sg1Var != null) {
                    zw zwVar = (zw) sg1Var;
                    synchronized (zw.f45561j) {
                        try {
                            ix ixVarA = zwVar.f45563c.a(this, str);
                            if (ixVarA == null) {
                                ixVarA = zwVar.f45562b.a(this, str);
                            }
                            if (ixVarA != null) {
                                zwVar.a(ixVarA);
                            }
                            Unit unit = Unit.f27471a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        }
    }

    public final boolean a(String str) {
        return ((SharedPreferences) this.f44031d.getValue()).contains(str);
    }

    public final void b(String str, boolean z5) {
        ((SharedPreferences) this.f44031d.getValue()).edit().putBoolean(str, z5).apply();
    }

    public final boolean a(String str, boolean z5) {
        return ((SharedPreferences) this.f44031d.getValue()).getBoolean(str, z5);
    }

    public final void b(int i, String str) {
        ((SharedPreferences) this.f44031d.getValue()).edit().putInt(str, i).apply();
    }

    public final int a(int i, String str) {
        ((SharedPreferences) this.f44031d.getValue()).contains(str);
        return ((SharedPreferences) this.f44031d.getValue()).getInt(str, i);
    }

    public final Set a(String str, Set set) {
        return ((SharedPreferences) this.f44031d.getValue()).getStringSet(str, set);
    }

    public final void a(String str, long j10) {
        ((SharedPreferences) this.f44031d.getValue()).edit().putLong(str, j10).apply();
    }

    public final void a(String str, String str2) {
        ((SharedPreferences) this.f44031d.getValue()).edit().putString(str, str2).apply();
    }

    public final void a(String str, HashSet hashSet) {
        ((SharedPreferences) this.f44031d.getValue()).edit().putStringSet(str, hashSet).apply();
    }

    public final void a(sg1 sg1Var) {
        if (this.f44032e.isEmpty()) {
            ((SharedPreferences) this.f44031d.getValue()).registerOnSharedPreferenceChangeListener(this);
        }
        this.f44032e.add(new WeakReference(sg1Var));
    }
}

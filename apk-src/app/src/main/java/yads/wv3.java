package yads;

import android.view.View;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wv3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f44496a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f44497b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f44498c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f44499d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f44500e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f44501f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f44502g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashSet f44503h = new HashSet();
    public final WeakHashMap i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f44504j;

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        Boolean bool;
        String str;
        qw3 qw3Var = qw3.f42411c;
        if (qw3Var != null) {
            for (zv3 zv3Var : Collections.unmodifiableCollection(qw3Var.f42413b)) {
                View view = (View) zv3Var.f45555d.get();
                if (zv3Var.f45557f && !zv3Var.f45558g) {
                    String str2 = zv3Var.f45559h;
                    if (view != null) {
                        boolean zC = kx3.c(view);
                        if (zC) {
                            this.f44503h.add(str2);
                        }
                        if (view.isAttachedToWindow()) {
                            if (view.hasWindowFocus()) {
                                this.i.remove(view);
                                bool = Boolean.FALSE;
                            } else if (this.i.containsKey(view)) {
                                bool = (Boolean) this.i.get(view);
                            } else {
                                WeakHashMap weakHashMap = this.i;
                                Boolean bool2 = Boolean.FALSE;
                                weakHashMap.put(view, bool2);
                                bool = bool2;
                            }
                            if (!bool.booleanValue() || zC) {
                                HashSet hashSet = new HashSet();
                                View view2 = view;
                                while (true) {
                                    if (view2 == null) {
                                        this.f44499d.addAll(hashSet);
                                        str = null;
                                        break;
                                    }
                                    String strA = kx3.a(view2);
                                    if (strA != null) {
                                        str = strA;
                                        break;
                                    } else {
                                        hashSet.add(view2);
                                        Object parent = view2.getParent();
                                        view2 = parent instanceof View ? (View) parent : null;
                                    }
                                }
                            } else {
                                str = "noWindowFocus";
                            }
                        } else {
                            str = "notAttached";
                        }
                        if (str == null) {
                            this.f44500e.add(str2);
                            this.f44496a.put(view, str2);
                            for (ax3 ax3Var : zv3Var.f45554c.f38939a) {
                                View view3 = (View) ax3Var.f36877a.get();
                                if (view3 != null) {
                                    pv3 pv3Var = (pv3) this.f44497b.get(view3);
                                    if (pv3Var != null) {
                                        pv3Var.f42084b.add(zv3Var.f45559h);
                                    } else {
                                        this.f44497b.put(view3, new pv3(ax3Var, zv3Var.f45559h));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.f44501f.add(str2);
                            this.f44498c.put(str2, view);
                            this.f44502g.put(str2, str);
                        }
                    } else {
                        this.f44501f.add(str2);
                        this.f44502g.put(str2, "noAdView");
                    }
                }
            }
        }
    }
}

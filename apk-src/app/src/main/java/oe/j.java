package oe;

import com.google.android.gms.internal.ads.gm1;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends AbstractMap implements Serializable {
    public static final ic.l i = new ic.l(7);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public gm1 f30658c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i f30662g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i f30663h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f30659d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f30660e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final gm1 f30661f = new gm1(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Comparator f30657b = i;

    public final gm1 a(Object obj, boolean z5) {
        int iCompareTo;
        gm1 gm1Var;
        gm1 gm1Var2 = this.f30658c;
        ic.l lVar = i;
        Comparator comparator = this.f30657b;
        if (gm1Var2 != null) {
            Comparable comparable = comparator == lVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = gm1Var2.f5866c;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return gm1Var2;
                }
                gm1 gm1Var3 = (gm1) (iCompareTo < 0 ? gm1Var2.f5870g : gm1Var2.f5871h);
                if (gm1Var3 == null) {
                    break;
                }
                gm1Var2 = gm1Var3;
            }
        } else {
            iCompareTo = 0;
        }
        gm1 gm1Var4 = gm1Var2;
        if (!z5) {
            return null;
        }
        gm1 gm1Var5 = this.f30661f;
        if (gm1Var4 != null) {
            gm1Var = new gm1(gm1Var4, obj, gm1Var5, (gm1) gm1Var5.f5872j, (byte) 0);
            if (iCompareTo < 0) {
                gm1Var4.f5870g = gm1Var;
            } else {
                gm1Var4.f5871h = gm1Var;
            }
            b(gm1Var4, true);
        } else {
            if (comparator == lVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            gm1Var = new gm1(gm1Var4, obj, gm1Var5, (gm1) gm1Var5.f5872j, (byte) 0);
            this.f30658c = gm1Var;
        }
        this.f30659d++;
        this.f30660e++;
        return gm1Var;
    }

    public final void b(gm1 gm1Var, boolean z5) {
        while (gm1Var != null) {
            gm1 gm1Var2 = (gm1) gm1Var.f5870g;
            gm1 gm1Var3 = (gm1) gm1Var.f5871h;
            int i10 = gm1Var2 != null ? gm1Var2.f5868e : 0;
            int i11 = gm1Var3 != null ? gm1Var3.f5868e : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                gm1 gm1Var4 = (gm1) gm1Var3.f5870g;
                gm1 gm1Var5 = (gm1) gm1Var3.f5871h;
                int i13 = (gm1Var4 != null ? gm1Var4.f5868e : 0) - (gm1Var5 != null ? gm1Var5.f5868e : 0);
                if (i13 == -1 || (i13 == 0 && !z5)) {
                    e(gm1Var);
                } else {
                    f(gm1Var3);
                    e(gm1Var);
                }
                if (z5) {
                    return;
                }
            } else if (i12 == 2) {
                gm1 gm1Var6 = (gm1) gm1Var2.f5870g;
                gm1 gm1Var7 = (gm1) gm1Var2.f5871h;
                int i14 = (gm1Var6 != null ? gm1Var6.f5868e : 0) - (gm1Var7 != null ? gm1Var7.f5868e : 0);
                if (i14 == 1 || (i14 == 0 && !z5)) {
                    f(gm1Var);
                } else {
                    e(gm1Var2);
                    f(gm1Var);
                }
                if (z5) {
                    return;
                }
            } else if (i12 == 0) {
                gm1Var.f5868e = i10 + 1;
                if (z5) {
                    return;
                }
            } else {
                gm1Var.f5868e = Math.max(i10, i11) + 1;
                if (!z5) {
                    return;
                }
            }
            gm1Var = (gm1) gm1Var.f5869f;
        }
    }

    public final void c(gm1 gm1Var, boolean z5) {
        gm1 gm1Var2;
        gm1 gm1Var3;
        int i10;
        if (z5) {
            gm1 gm1Var4 = (gm1) gm1Var.f5872j;
            gm1Var4.i = (gm1) gm1Var.i;
            ((gm1) gm1Var.i).f5872j = gm1Var4;
        }
        gm1 gm1Var5 = (gm1) gm1Var.f5870g;
        gm1 gm1Var6 = (gm1) gm1Var.f5871h;
        gm1 gm1Var7 = (gm1) gm1Var.f5869f;
        int i11 = 0;
        if (gm1Var5 == null || gm1Var6 == null) {
            if (gm1Var5 != null) {
                d(gm1Var, gm1Var5);
                gm1Var.f5870g = null;
            } else if (gm1Var6 != null) {
                d(gm1Var, gm1Var6);
                gm1Var.f5871h = null;
            } else {
                d(gm1Var, null);
            }
            b(gm1Var7, false);
            this.f30659d--;
            this.f30660e++;
            return;
        }
        if (gm1Var5.f5868e > gm1Var6.f5868e) {
            Map.Entry entry = gm1Var5.f5871h;
            while (true) {
                gm1 gm1Var8 = (gm1) entry;
                gm1Var3 = gm1Var5;
                gm1Var5 = gm1Var8;
                if (gm1Var5 == null) {
                    break;
                } else {
                    entry = gm1Var5.f5871h;
                }
            }
        } else {
            Map.Entry entry2 = gm1Var6.f5870g;
            while (true) {
                gm1Var2 = gm1Var6;
                gm1Var6 = (gm1) entry2;
                if (gm1Var6 == null) {
                    break;
                } else {
                    entry2 = gm1Var6.f5870g;
                }
            }
            gm1Var3 = gm1Var2;
        }
        c(gm1Var3, false);
        gm1 gm1Var9 = (gm1) gm1Var.f5870g;
        if (gm1Var9 != null) {
            i10 = gm1Var9.f5868e;
            gm1Var3.f5870g = gm1Var9;
            gm1Var9.f5869f = gm1Var3;
            gm1Var.f5870g = null;
        } else {
            i10 = 0;
        }
        gm1 gm1Var10 = (gm1) gm1Var.f5871h;
        if (gm1Var10 != null) {
            i11 = gm1Var10.f5868e;
            gm1Var3.f5871h = gm1Var10;
            gm1Var10.f5869f = gm1Var3;
            gm1Var.f5871h = null;
        }
        gm1Var3.f5868e = Math.max(i10, i11) + 1;
        d(gm1Var, gm1Var3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f30658c = null;
        this.f30659d = 0;
        this.f30660e++;
        gm1 gm1Var = this.f30661f;
        gm1Var.f5872j = gm1Var;
        gm1Var.i = gm1Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        gm1 gm1VarA = null;
        if (obj != null) {
            try {
                gm1VarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return gm1VarA != null;
    }

    public final void d(gm1 gm1Var, gm1 gm1Var2) {
        gm1 gm1Var3 = (gm1) gm1Var.f5869f;
        gm1Var.f5869f = null;
        if (gm1Var2 != null) {
            gm1Var2.f5869f = gm1Var3;
        }
        if (gm1Var3 == null) {
            this.f30658c = gm1Var2;
        } else if (((gm1) gm1Var3.f5870g) == gm1Var) {
            gm1Var3.f5870g = gm1Var2;
        } else {
            gm1Var3.f5871h = gm1Var2;
        }
    }

    public final void e(gm1 gm1Var) {
        gm1 gm1Var2 = (gm1) gm1Var.f5870g;
        gm1 gm1Var3 = (gm1) gm1Var.f5871h;
        gm1 gm1Var4 = (gm1) gm1Var3.f5870g;
        gm1 gm1Var5 = (gm1) gm1Var3.f5871h;
        gm1Var.f5871h = gm1Var4;
        if (gm1Var4 != null) {
            gm1Var4.f5869f = gm1Var;
        }
        d(gm1Var, gm1Var3);
        gm1Var3.f5870g = gm1Var;
        gm1Var.f5869f = gm1Var3;
        int iMax = Math.max(gm1Var2 != null ? gm1Var2.f5868e : 0, gm1Var4 != null ? gm1Var4.f5868e : 0) + 1;
        gm1Var.f5868e = iMax;
        gm1Var3.f5868e = Math.max(iMax, gm1Var5 != null ? gm1Var5.f5868e : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        i iVar = this.f30662g;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(this, 0);
        this.f30662g = iVar2;
        return iVar2;
    }

    public final void f(gm1 gm1Var) {
        gm1 gm1Var2 = (gm1) gm1Var.f5870g;
        gm1 gm1Var3 = (gm1) gm1Var.f5871h;
        gm1 gm1Var4 = (gm1) gm1Var2.f5870g;
        gm1 gm1Var5 = (gm1) gm1Var2.f5871h;
        gm1Var.f5870g = gm1Var5;
        if (gm1Var5 != null) {
            gm1Var5.f5869f = gm1Var;
        }
        d(gm1Var, gm1Var2);
        gm1Var2.f5871h = gm1Var;
        gm1Var.f5869f = gm1Var2;
        int iMax = Math.max(gm1Var3 != null ? gm1Var3.f5868e : 0, gm1Var5 != null ? gm1Var5.f5868e : 0) + 1;
        gm1Var.f5868e = iMax;
        gm1Var2.f5868e = Math.max(iMax, gm1Var4 != null ? gm1Var4.f5868e : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        gm1 gm1VarA;
        if (obj != null) {
            try {
                gm1VarA = a(obj, false);
            } catch (ClassCastException unused) {
                gm1VarA = null;
            }
        } else {
            gm1VarA = null;
        }
        if (gm1VarA != null) {
            return gm1VarA.f5867d;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        i iVar = this.f30663h;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(this, 1);
        this.f30663h = iVar2;
        return iVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        gm1 gm1VarA = a(obj, true);
        Object obj3 = gm1VarA.f5867d;
        gm1VarA.f5867d = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        gm1 gm1VarA;
        if (obj != null) {
            try {
                gm1VarA = a(obj, false);
            } catch (ClassCastException unused) {
                gm1VarA = null;
            }
        } else {
            gm1VarA = null;
        }
        if (gm1VarA != null) {
            c(gm1VarA, true);
        }
        if (gm1VarA != null) {
            return gm1VarA.f5867d;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f30659d;
    }
}

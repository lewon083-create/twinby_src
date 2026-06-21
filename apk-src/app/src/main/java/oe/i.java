package oe;

import com.google.android.gms.internal.ads.gm1;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends AbstractSet {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f30656c;

    public /* synthetic */ i(j jVar, int i) {
        this.f30655b = i;
        this.f30656c = jVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f30655b) {
            case 0:
                this.f30656c.clear();
                break;
            default:
                this.f30656c.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        gm1 gm1VarA;
        Object obj2;
        Object value;
        switch (this.f30655b) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                j jVar = this.f30656c;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                gm1 gm1Var = null;
                if (key != null) {
                    try {
                        gm1VarA = jVar.a(key, false);
                    } catch (ClassCastException unused) {
                        gm1VarA = null;
                    }
                    break;
                } else {
                    gm1VarA = null;
                }
                if (gm1VarA != null && ((obj2 = gm1VarA.f5867d) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                    gm1Var = gm1VarA;
                }
                return gm1Var != null;
            default:
                return this.f30656c.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f30655b) {
            case 0:
                return new h(this.f30656c, 0);
            default:
                return new h(this.f30656c, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        gm1 gm1VarA;
        Object obj2;
        Object value;
        switch (this.f30655b) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    j jVar = this.f30656c;
                    gm1 gm1Var = null;
                    if (key != null) {
                        try {
                            gm1VarA = jVar.a(key, false);
                        } catch (ClassCastException unused) {
                            gm1VarA = null;
                        }
                    } else {
                        gm1VarA = null;
                    }
                    if (gm1VarA != null && ((obj2 = gm1VarA.f5867d) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                        gm1Var = gm1VarA;
                    }
                    if (gm1Var != null) {
                        jVar.c(gm1Var, true);
                        break;
                    }
                    break;
                }
                break;
            default:
                j jVar2 = this.f30656c;
                gm1 gm1VarA2 = null;
                if (obj != null) {
                    try {
                        gm1VarA2 = jVar2.a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (gm1VarA2 != null) {
                    jVar2.c(gm1VarA2, true);
                }
                if (gm1VarA2 != null) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f30655b) {
        }
        return this.f30656c.f30659d;
    }
}

package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class dm1 extends AbstractSet {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hm1 f4605c;

    public /* synthetic */ dm1(hm1 hm1Var, int i) {
        this.f4604b = i;
        this.f4605c = hm1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f4604b) {
            case 0:
                this.f4605c.clear();
                break;
            default:
                this.f4605c.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        gm1 gm1VarA;
        switch (this.f4604b) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                hm1 hm1Var = this.f4605c;
                hm1Var.getClass();
                Object key = entry.getKey();
                gm1 gm1Var = null;
                if (key != null) {
                    try {
                        gm1VarA = hm1Var.a(key, false);
                    } catch (ClassCastException unused) {
                        gm1VarA = null;
                    }
                    break;
                } else {
                    gm1VarA = null;
                }
                if (gm1VarA != null && Objects.equals(gm1VarA.f5867d, entry.getValue())) {
                    gm1Var = gm1VarA;
                }
                return gm1Var != null;
            default:
                return this.f4605c.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f4604b) {
            case 0:
                return new cm1(this.f4605c, 0);
            default:
                return new cm1(this.f4605c, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        gm1 gm1VarA;
        switch (this.f4604b) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    hm1 hm1Var = this.f4605c;
                    hm1Var.getClass();
                    Object key = entry.getKey();
                    gm1 gm1Var = null;
                    if (key != null) {
                        try {
                            gm1VarA = hm1Var.a(key, false);
                        } catch (ClassCastException unused) {
                            gm1VarA = null;
                        }
                    } else {
                        gm1VarA = null;
                    }
                    if (gm1VarA != null && Objects.equals(gm1VarA.f5867d, entry.getValue())) {
                        gm1Var = gm1VarA;
                    }
                    if (gm1Var != null) {
                        hm1Var.b(gm1Var, true);
                    }
                    break;
                }
                break;
            default:
                hm1 hm1Var2 = this.f4605c;
                hm1Var2.getClass();
                gm1 gm1VarA2 = null;
                if (obj != null) {
                    try {
                        gm1VarA2 = hm1Var2.a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (gm1VarA2 != null) {
                    hm1Var2.b(gm1VarA2, true);
                }
                if (gm1VarA2 != null) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f4604b) {
        }
        return this.f4605c.f6189d;
    }
}

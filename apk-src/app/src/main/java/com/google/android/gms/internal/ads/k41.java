package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k41 extends AbstractSet {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m41 f7117c;

    public /* synthetic */ k41(m41 m41Var, int i) {
        this.f7116b = i;
        this.f7117c = m41Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f7116b) {
            case 0:
                this.f7117c.clear();
                break;
            default:
                this.f7117c.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f7116b) {
            case 0:
                m41 m41Var = this.f7117c;
                Map mapE = m41Var.e();
                if (mapE != null) {
                    return mapE.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int i = m41Var.i(entry.getKey());
                    if (i != -1 && Objects.equals(m41Var.c()[i], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f7117c.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f7116b) {
            case 0:
                m41 m41Var = this.f7117c;
                Map mapE = m41Var.e();
                return mapE != null ? mapE.entrySet().iterator() : new j41(m41Var, 1);
            default:
                m41 m41Var2 = this.f7117c;
                Map mapE2 = m41Var2.e();
                return mapE2 != null ? mapE2.keySet().iterator() : new j41(m41Var2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f7116b) {
            case 0:
                m41 m41Var = this.f7117c;
                Map mapE = m41Var.e();
                if (mapE != null) {
                    return mapE.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!m41Var.d()) {
                        int iG = m41Var.g();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = m41Var.f7766b;
                        Objects.requireNonNull(obj2);
                        int iW = ix.W(key, value, iG, obj2, m41Var.a(), m41Var.b(), m41Var.c());
                        if (iW != -1) {
                            m41Var.f(iW, iG);
                            m41Var.f7771g--;
                            m41Var.f7770f += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                m41 m41Var2 = this.f7117c;
                Map mapE2 = m41Var2.e();
                return mapE2 != null ? mapE2.keySet().remove(obj) : m41Var2.j(obj) != m41.f7765k;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f7116b) {
        }
        return this.f7117c.size();
    }
}

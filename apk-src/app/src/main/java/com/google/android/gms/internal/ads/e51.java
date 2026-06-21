package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e51 extends d51 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4839e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Object f4840f;

    public e51(f51 f51Var) {
        this.f4840f = f51Var;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final d61 a() {
        switch (this.f4839e) {
            case 0:
                return new z41((f51) this.f4840f);
            default:
                return new j51(this.f4840f);
        }
    }

    @Override // com.google.android.gms.internal.ads.t41, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f4839e) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    f51 f51Var = (f51) this.f4840f;
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    Collection collection = (Collection) ((w51) f51Var.d()).get(key);
                    if (collection != null && collection.contains(value)) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f4840f.equals(obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.d51, com.google.android.gms.internal.ads.t41
    public x41 g() {
        switch (this.f4839e) {
            case 1:
                return x41.q(this.f4840f);
            default:
                return super.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.d51, java.util.Collection, java.util.Set
    public int hashCode() {
        switch (this.f4839e) {
            case 1:
                return this.f4840f.hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        switch (this.f4839e) {
            case 0:
                return new z41((f51) this.f4840f);
            default:
                return new j51(this.f4840f);
        }
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final boolean n() {
        switch (this.f4839e) {
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public int o(Object[] objArr, int i) {
        switch (this.f4839e) {
            case 1:
                objArr[i] = this.f4840f;
                return i + 1;
            default:
                return super.o(objArr, i);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f4839e) {
            case 0:
                return ((f51) this.f4840f).f5244f;
            default:
                return 1;
        }
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        switch (this.f4839e) {
            case 1:
                String string = this.f4840f.toString();
                return t.z.g(new StringBuilder(String.valueOf(string).length() + 2), "[", string, "]");
            default:
                return super.toString();
        }
    }

    public e51(Object obj) {
        obj.getClass();
        this.f4840f = obj;
    }
}

package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l41 implements Map.Entry {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m41 f7387d;

    public l41(m41 m41Var, int i) {
        Objects.requireNonNull(m41Var);
        this.f7387d = m41Var;
        this.f7385b = m41Var.b()[i];
        this.f7386c = i;
    }

    public final void a() {
        int i = this.f7386c;
        Object obj = this.f7385b;
        m41 m41Var = this.f7387d;
        if (i != -1 && i < m41Var.size()) {
            if (Objects.equals(obj, m41Var.b()[this.f7386c])) {
                return;
            }
        }
        this.f7386c = m41Var.i(obj);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (Objects.equals(getKey(), entry.getKey()) && Objects.equals(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f7385b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        m41 m41Var = this.f7387d;
        Map mapE = m41Var.e();
        if (mapE != null) {
            return mapE.get(this.f7385b);
        }
        a();
        int i = this.f7386c;
        if (i == -1) {
            return null;
        }
        return m41Var.c()[i];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        m41 m41Var = this.f7387d;
        Map mapE = m41Var.e();
        Object obj2 = this.f7385b;
        if (mapE != null) {
            return mapE.put(obj2, obj);
        }
        a();
        int i = this.f7386c;
        if (i == -1) {
            m41Var.put(obj2, obj);
            return null;
        }
        Object obj3 = m41Var.c()[i];
        m41Var.c()[this.f7386c] = obj;
        return obj3;
    }

    public final String toString() {
        String strValueOf = String.valueOf(getKey());
        String strValueOf2 = String.valueOf(getValue());
        return t.z.g(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, "=", strValueOf2);
    }
}

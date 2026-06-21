package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class gm1 implements Map.Entry {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f5867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map.Entry f5869f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map.Entry f5870g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Map.Entry f5871h;
    public Map.Entry i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Map.Entry f5872j;

    public /* synthetic */ gm1(int i) {
        this.f5865b = i;
        this.f5866c = null;
        this.f5872j = this;
        this.i = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        switch (this.f5865b) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object obj2 = this.f5866c;
                    if (obj2 == null) {
                        if (entry.getKey() != null) {
                        }
                    } else if (!obj2.equals(entry.getKey())) {
                    }
                    Object obj3 = this.f5867d;
                    if (obj3 == null) {
                        if (entry.getValue() == null) {
                        }
                    } else if (!obj3.equals(entry.getValue())) {
                    }
                }
                break;
            default:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry2 = (Map.Entry) obj;
                    Object obj4 = this.f5866c;
                    if (obj4 == null) {
                        if (entry2.getKey() != null) {
                        }
                    } else if (!obj4.equals(entry2.getKey())) {
                    }
                    Object obj5 = this.f5867d;
                    if (obj5 == null) {
                        if (entry2.getValue() == null) {
                        }
                    } else if (obj5.equals(entry2.getValue())) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.f5865b) {
        }
        return this.f5866c;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        switch (this.f5865b) {
        }
        return this.f5867d;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        switch (this.f5865b) {
            case 0:
                Object obj = this.f5866c;
                int iHashCode = obj == null ? 0 : obj.hashCode();
                Object obj2 = this.f5867d;
                return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
            default:
                Object obj3 = this.f5866c;
                int iHashCode2 = obj3 == null ? 0 : obj3.hashCode();
                Object obj4 = this.f5867d;
                return (obj4 != null ? obj4.hashCode() : 0) ^ iHashCode2;
        }
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        switch (this.f5865b) {
            case 0:
                if (obj == null) {
                    throw new NullPointerException("value == null");
                }
                Object obj2 = this.f5867d;
                this.f5867d = obj;
                return obj2;
            default:
                Object obj3 = this.f5867d;
                this.f5867d = obj;
                return obj3;
        }
    }

    public final String toString() {
        switch (this.f5865b) {
            case 0:
                String strValueOf = String.valueOf(this.f5866c);
                String strValueOf2 = String.valueOf(this.f5867d);
                return t.z.g(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, "=", strValueOf2);
            default:
                return this.f5866c + "=" + this.f5867d;
        }
    }

    public gm1(gm1 gm1Var, Object obj, gm1 gm1Var2, gm1 gm1Var3) {
        this.f5865b = 0;
        this.f5869f = gm1Var;
        this.f5866c = obj;
        this.f5868e = 1;
        this.i = gm1Var2;
        this.f5872j = gm1Var3;
        gm1Var3.i = this;
        gm1Var2.f5872j = this;
    }

    public gm1(gm1 gm1Var, Object obj, gm1 gm1Var2, gm1 gm1Var3, byte b2) {
        this.f5865b = 1;
        this.f5869f = gm1Var;
        this.f5866c = obj;
        this.f5868e = 1;
        this.i = gm1Var2;
        this.f5872j = gm1Var3;
        gm1Var3.i = this;
        gm1Var2.f5872j = this;
    }
}

package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Gc extends HashMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22378a;

    public Gc() {
        this.f22378a = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String put(String str, String str2) {
        if (!containsKey(str)) {
            if (str2 == null) {
                return null;
            }
            this.f22378a = pe.a.b(str.length(), this.f22378a, str2);
            return (String) super.put(str, str2);
        }
        if (str2 != null) {
            String str3 = (String) get(str);
            this.f22378a = (str2.length() - (str3 != null ? str3.length() : 0)) + this.f22378a;
            return (String) super.put(str, str2);
        }
        if (containsKey(str)) {
            String str4 = (String) get(str);
            this.f22378a -= str.length() + (str4 != null ? str4.length() : 0);
        }
        return (String) super.remove(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (containsKey(obj)) {
            String str = (String) get(obj);
            this.f22378a -= ((String) obj).length() + (str == null ? 0 : str.length());
        }
        return (String) super.remove(obj);
    }

    public Gc(String str) {
        super(AbstractC0207hb.d(str));
        this.f22378a = 0;
        for (String str2 : keySet()) {
            String str3 = (String) get(str2);
            this.f22378a = str2.length() + (str3 == null ? 0 : str3.length()) + this.f22378a;
        }
    }
}

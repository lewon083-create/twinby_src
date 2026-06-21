package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class el {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedList f4992a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f4993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4994c;

    public el(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f4993b = linkedHashMap;
        this.f4994c = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str);
    }

    public static final cl d() {
        p9.k.C.f31304k.getClass();
        return new cl(SystemClock.elapsedRealtime(), null, null);
    }

    public final void a(cl clVar, long j10, String... strArr) {
        synchronized (this.f4994c) {
            this.f4992a.add(new cl(j10, strArr[0], clVar));
        }
    }

    public final dl b() {
        dl dlVar;
        boolean zBooleanValue = ((Boolean) q9.s.f31967e.f31970c.a(al.f3118n2)).booleanValue();
        StringBuilder sb2 = new StringBuilder();
        HashMap map = new HashMap();
        synchronized (this.f4994c) {
            try {
                LinkedList<cl> linkedList = this.f4992a;
                for (cl clVar : linkedList) {
                    long j10 = clVar.f4243a;
                    String str = clVar.f4244b;
                    cl clVar2 = clVar.f4245c;
                    if (clVar2 != null && j10 > 0) {
                        long j11 = j10 - clVar2.f4243a;
                        sb2.append(str);
                        sb2.append('.');
                        sb2.append(j11);
                        sb2.append(',');
                        if (zBooleanValue) {
                            if (map.containsKey(Long.valueOf(clVar2.f4243a))) {
                                StringBuilder sb3 = (StringBuilder) map.get(Long.valueOf(clVar2.f4243a));
                                sb3.append('+');
                                sb3.append(str);
                            } else {
                                map.put(Long.valueOf(clVar2.f4243a), new StringBuilder(str));
                            }
                        }
                    }
                }
                linkedList.clear();
                String string = null;
                if (!TextUtils.isEmpty(null)) {
                    sb2.append((String) null);
                } else if (sb2.length() > 0) {
                    sb2.setLength(sb2.length() - 1);
                }
                StringBuilder sb4 = new StringBuilder();
                if (zBooleanValue) {
                    for (Map.Entry entry : map.entrySet()) {
                        sb4.append((CharSequence) entry.getValue());
                        sb4.append('.');
                        long jLongValue = ((Long) entry.getKey()).longValue();
                        p9.k kVar = p9.k.C;
                        kVar.f31304k.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        kVar.f31304k.getClass();
                        sb4.append((jLongValue - SystemClock.elapsedRealtime()) + jCurrentTimeMillis);
                        sb4.append(',');
                    }
                    if (sb4.length() > 0) {
                        sb4.setLength(sb4.length() - 1);
                    }
                    string = sb4.toString();
                }
                dlVar = new dl(sb2.toString(), string);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dlVar;
    }

    public final void c(String str, String str2) {
        com.google.android.gms.internal.consent_sdk.c cVarA;
        if (TextUtils.isEmpty(str2) || (cVarA = p9.k.C.f31302h.a()) == null) {
            return;
        }
        synchronized (this.f4994c) {
            bl blVar = (bl) ((HashMap) cVarA.f13339c).get(str);
            if (blVar == null) {
                blVar = bl.f3808b;
            }
            LinkedHashMap linkedHashMap = this.f4993b;
            linkedHashMap.put(str, blVar.a((String) linkedHashMap.get(str), str2));
        }
    }
}

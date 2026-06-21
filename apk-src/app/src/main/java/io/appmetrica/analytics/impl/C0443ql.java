package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ql, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0443ql {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dc f24659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Cc f24660b;

    public C0443ql(PublicLogger publicLogger, String str) {
        this(new Dc(str, publicLogger), new Cc(str, publicLogger));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized boolean a(Gc gc, String str, String str2) {
        try {
            int size = gc.size();
            int i = this.f24659a.f22248c.f24398a;
            if (size < i || (i == gc.size() && gc.containsKey(str))) {
                this.f24660b.getClass();
                int length = gc.f22378a;
                if (str2 != null) {
                    length += str2.length();
                }
                if (gc.containsKey(str)) {
                    String str3 = (String) gc.get(str);
                    if (str3 != null) {
                        length -= str3.length();
                    }
                } else {
                    length += str.length();
                }
                if (length <= 4500) {
                    gc.put(str, str2);
                    return true;
                }
                Cc cc2 = this.f24660b;
                cc2.f22207b.warning("The %s has reached the total size limit that equals %d symbols. Item with key %s will be ignored", cc2.f22206a, 4500, str);
            } else {
                Dc dc2 = this.f24659a;
                dc2.f22249d.warning("The %s has reached the limit of %d items. Item with key %s will be ignored", dc2.f22250e, Integer.valueOf(dc2.f22248c.f24398a), str);
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final boolean b(Gc gc, String str, String str2) {
        if (gc == null) {
            return false;
        }
        String strA = this.f24659a.f22246a.a(str);
        String strA2 = this.f24659a.f22247b.a(str2);
        if (!gc.containsKey(strA)) {
            if (strA2 != null) {
                return a(gc, strA, strA2);
            }
            return false;
        }
        String str3 = (String) gc.get(strA);
        if (strA2 == null || !strA2.equals(str3)) {
            return a(gc, strA, strA2);
        }
        return false;
    }

    public C0443ql(Dc dc2, Cc cc2) {
        this.f24659a = dc2;
        this.f24660b = cc2;
    }
}

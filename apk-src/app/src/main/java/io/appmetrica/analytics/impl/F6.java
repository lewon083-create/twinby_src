package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class F6 implements DataSendingRestrictionController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D6 f22321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f22322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f22323c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f22324d = new HashSet();

    public F6(@NonNull D6 d62) {
        this.f22321a = d62;
        this.f22322b = ((E6) d62).a();
    }

    public final synchronized void a(Boolean bool) {
        try {
            if (ko.a(bool) || this.f22322b == null) {
                boolean zEquals = Boolean.FALSE.equals(bool);
                this.f22322b = Boolean.valueOf(zEquals);
                ((E6) this.f22321a).f22272a.c(zEquals).b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(Boolean bool) {
        if (this.f22322b == null) {
            a(bool);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForMainReporter() {
        return Boolean.TRUE.equals(this.f22322b);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean isRestrictedForReporter(@androidx.annotation.NonNull java.lang.String r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.HashSet r0 = r1.f22323c     // Catch: java.lang.Throwable -> L16
            boolean r2 = r0.contains(r2)     // Catch: java.lang.Throwable -> L16
            if (r2 != 0) goto L18
            java.lang.Boolean r2 = r1.f22322b     // Catch: java.lang.Throwable -> L16
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L16
            boolean r2 = r0.equals(r2)     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L14
            goto L18
        L14:
            r2 = 0
            goto L19
        L16:
            r2 = move-exception
            goto L1b
        L18:
            r2 = 1
        L19:
            monitor-exit(r1)
            return r2
        L1b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.F6.isRestrictedForReporter(java.lang.String):boolean");
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForSdk() {
        Boolean bool;
        try {
            bool = this.f22322b;
        } catch (Throwable th2) {
            throw th2;
        }
        return bool == null ? this.f22324d.isEmpty() : bool.booleanValue();
    }

    public final synchronized void a(@NonNull String str, Boolean bool) {
        try {
            if (ko.a(bool) || (!this.f22324d.contains(str) && !this.f22323c.contains(str))) {
                if (((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue()) {
                    this.f22324d.add(str);
                    this.f22323c.remove(str);
                } else {
                    this.f22323c.add(str);
                    this.f22324d.remove(str);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}

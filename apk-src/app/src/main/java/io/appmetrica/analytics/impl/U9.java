package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class U9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Sl f23071a = new Sl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public W9 f23072b = new W9();

    public final synchronized void a(W9 w92) {
        this.f23072b = w92;
    }

    public final synchronized void a(List list, HashMap map) {
        Boolean bool;
        String str;
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (Intrinsics.a((String) it.next(), "appmetrica_lib_ssl_enabled") && (bool = this.f23072b.f23212a) != null) {
                    boolean zBooleanValue = bool.booleanValue();
                    W9 w92 = this.f23072b;
                    IdentifierStatus identifierStatus = w92.f23213b;
                    String str2 = w92.f23214c;
                    if (zBooleanValue) {
                        str = "true";
                    } else {
                        if (zBooleanValue) {
                            throw new ij.j();
                        }
                        str = "false";
                    }
                    map.put("appmetrica_lib_ssl_enabled", this.f23071a.a(new IdentifiersResult(str, identifierStatus, str2)));
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}

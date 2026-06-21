package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Xk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0299l2 f23262a;

    public Xk(InterfaceC0299l2 interfaceC0299l2) {
        this.f23262a = interfaceC0299l2;
    }

    public final ArrayList a(Iterable iterable) {
        String hexString;
        String strA;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                strA = this.f23262a.a(str);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (strA == null || (hexString = StringUtils.toHexString(MessageDigest.getInstance("SHA-256").digest(strA.getBytes(Charsets.UTF_8)))) == null) {
                PublicLogger.Companion.getAnonymousInstance().info("Input " + str + " is not a valid data", new Object[0]);
                hexString = null;
            }
            if (hexString != null) {
                arrayList.add(hexString);
            }
        }
        return arrayList;
    }
}

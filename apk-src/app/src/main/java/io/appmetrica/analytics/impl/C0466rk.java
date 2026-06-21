package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.rk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0466rk implements Jc {
    public static final boolean a(SQLiteDatabase sQLiteDatabase) {
        return true;
    }

    public static void b(Context context) {
        Z6 z62;
        C0442qk c0442qk = new C0442qk();
        C0417pk c0417pk = new C0417pk();
        C0219hn c0219hn = new C0219hn(c0417pk, c0417pk, new C0432qa(false), new ig.a(15));
        C0616xk c0616xkB = C0382oa.I.B();
        synchronized (c0616xkB) {
            C0048b7 c0048b7 = c0616xkB.f25031a;
            z62 = new Z6(context, new C0022a7(c0048b7.f23493a, c0048b7.f23494b, false).a(context, c0442qk), c0219hn, PublicLogger.getAnonymousInstance());
        }
        byte[] bArr = new T2(new C0418pl(z62), "binary_data").get("auto_inapp_collecting_info_data");
        if (bArr != null) {
            C0382oa.I.B().c(context).insert("auto_inapp_collecting_info_data", bArr);
        }
    }

    @Override // io.appmetrica.analytics.impl.Jc
    public final void a(@NotNull Context context) {
        Qm qm = (Qm) Om.a(C0243im.class);
        ProtobufStateStorage<Object> protobufStateStorageA = qm.a(context, qm.b(context));
        C0243im c0243im = (C0243im) protobufStateStorageA.read();
        C0218hm c0218hmA = c0243im.a(c0243im.f24104m);
        c0218hmA.f24012o = 0L;
        protobufStateStorageA.save(new C0243im(c0218hmA));
        b(context);
    }
}

package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.vk.api.sdk.exceptions.VKApiCodes;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.nk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0367nk implements Jc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vo f24450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24451b = "startup_state";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AESEncrypter f24452c;

    public C0367nk(@NotNull vo voVar) {
        this.f24450a = voVar;
        C0014a c0014a = new C0014a(C0382oa.k().g());
        this.f24452c = new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, c0014a.b(), c0014a.a());
    }

    public static void a(vo voVar, C0218hm c0218hm, Bb bb2) {
        String strOptStringOrNull;
        synchronized (voVar) {
            strOptStringOrNull = JsonUtils.optStringOrNull(voVar.f24950a.a(), VKApiCodes.PARAM_DEVICE_ID);
        }
        if (TextUtils.isEmpty(strOptStringOrNull)) {
            if (!TextUtils.isEmpty(bb2.f22142d)) {
                voVar.a(bb2.f22142d);
            }
            if (!TextUtils.isEmpty(bb2.f22143e)) {
                voVar.b(bb2.f22143e);
            }
            if (TextUtils.isEmpty(bb2.f22139a)) {
                return;
            }
            c0218hm.f23999a = bb2.f22139a;
        }
    }

    @Override // io.appmetrica.analytics.impl.Jc
    public final void a(@NotNull Context context) {
        SQLiteDatabase readableDatabase = C0382oa.I.B().f(context).getReadableDatabase();
        if (readableDatabase != null) {
            try {
                Bb bbA = a(readableDatabase);
                C0218hm c0218hm = new C0218hm(new C0326m4(new C0276k4()));
                if (bbA != null) {
                    a(this.f24450a, c0218hm, bbA);
                    c0218hm.f24013p = bbA.f22141c;
                    c0218hm.f24015r = bbA.f22140b;
                }
                C0243im c0243im = new C0243im(c0218hm);
                Qm qm = (Qm) Om.a(C0243im.class);
                qm.a(context, qm.b(context)).save(c0243im);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047 A[Catch: all -> 0x004c, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x004c, blocks: (B:5:0x001b, B:7:0x0022, B:9:0x0028, B:13:0x0047), top: B:21:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.Bb a(android.database.sqlite.SQLiteDatabase r11) {
        /*
            r10 = this;
            java.lang.String r0 = "value"
            r1 = 0
            java.lang.String r3 = "binary_data"
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L4b
            java.lang.String r5 = "data_key = ?"
            java.lang.String r2 = r10.f24451b     // Catch: java.lang.Throwable -> L4b
            java.lang.String[] r6 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L4b
            r8 = 0
            r9 = 0
            r7 = 0
            r2 = r11
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L4b
            if (r11 == 0) goto L45
            int r2 = r11.getCount()     // Catch: java.lang.Throwable -> L4c
            r3 = 1
            if (r2 != r3) goto L45
            boolean r2 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L4c
            if (r2 == 0) goto L45
            int r0 = r11.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L4c
            byte[] r0 = r11.getBlob(r0)     // Catch: java.lang.Throwable -> L4c
            io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter r2 = r10.f24452c     // Catch: java.lang.Throwable -> L4c
            byte[] r0 = r2.decrypt(r0)     // Catch: java.lang.Throwable -> L4c
            io.appmetrica.analytics.impl.Bb r2 = new io.appmetrica.analytics.impl.Bb     // Catch: java.lang.Throwable -> L4c
            r2.<init>()     // Catch: java.lang.Throwable -> L4c
            io.appmetrica.analytics.protobuf.nano.MessageNano r0 = io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(r2, r0)     // Catch: java.lang.Throwable -> L4c
            io.appmetrica.analytics.impl.Bb r0 = (io.appmetrica.analytics.impl.Bb) r0     // Catch: java.lang.Throwable -> L4c
            io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt.closeSafely(r11)
            return r0
        L45:
            if (r11 == 0) goto L4c
            r11.getCount()     // Catch: java.lang.Throwable -> L4c
            goto L4c
        L4b:
            r11 = r1
        L4c:
            io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt.closeSafely(r11)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C0367nk.a(android.database.sqlite.SQLiteDatabase):io.appmetrica.analytics.impl.Bb");
    }
}

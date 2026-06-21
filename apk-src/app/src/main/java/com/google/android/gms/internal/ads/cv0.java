package com.google.android.gms.internal.ads;

import android.os.Build;
import io.sentry.SentryBaseEvent;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class cv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f4336a = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f4337b = {-110, -13, -34, 70, -83, 43, 97, 21, -44, 16, -54, -125, -28, -57, -125, -127, -7, 17, 102, -69, 116, -121, -79, 43, -13, 120, 58, 55, -29, -108, 95, 83};

    public static boolean a(File file) {
        try {
            X509Certificate[][] x509CertificateArrK = nz.k(file.getAbsolutePath());
            if (x509CertificateArrK.length != 1) {
                throw new GeneralSecurityException("APK has more than one signature.");
            }
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(x509CertificateArrK[0][0].getEncoded());
            return Arrays.equals(f4336a, bArrDigest) || (!SentryBaseEvent.JsonKeys.USER.equals(Build.TYPE) && Arrays.equals(f4337b, bArrDigest));
        } catch (da e3) {
            throw new GeneralSecurityException("Package is not signed", e3);
        } catch (IOException | RuntimeException e7) {
            throw new GeneralSecurityException("Failed to verify signatures", e7);
        }
    }
}

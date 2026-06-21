package com.vk.api.sdk.browser;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Base64;
import gf.a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class BrowserDescriptor {
    private static final String DIGEST_SHA_512 = "SHA-512";
    private static final int PRIME_HASH_FACTOR = 92821;
    public final String packageName;
    public final Set<String> signatureHashes;
    public final Boolean useCustomTab;
    public final String version;

    public BrowserDescriptor(PackageInfo packageInfo, boolean z5) {
        this(packageInfo.packageName, generateSignatureHashes(packageInfo.signatures), packageInfo.versionName, z5);
    }

    public static String generateSignatureHash(Signature signature) {
        try {
            return Base64.encodeToString(MessageDigest.getInstance(DIGEST_SHA_512).digest(signature.toByteArray()), 10);
        } catch (NoSuchAlgorithmException unused) {
            throw new IllegalStateException("Platform does not supportSHA-512 hashing");
        }
    }

    public static Set<String> generateSignatureHashes(Signature[] signatureArr) {
        HashSet hashSet = new HashSet();
        for (Signature signature : signatureArr) {
            hashSet.add(generateSignatureHash(signature));
        }
        return hashSet;
    }

    public BrowserDescriptor changeUseCustomTab(boolean z5) {
        return new BrowserDescriptor(this.packageName, this.signatureHashes, this.version, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof BrowserDescriptor)) {
            BrowserDescriptor browserDescriptor = (BrowserDescriptor) obj;
            if (this.packageName.equals(browserDescriptor.packageName) && this.version.equals(browserDescriptor.version) && this.useCustomTab == browserDescriptor.useCustomTab && this.signatureHashes.equals(browserDescriptor.signatureHashes)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iE = (this.useCustomTab.booleanValue() ? 1 : 0) + a.e(this.packageName.hashCode() * PRIME_HASH_FACTOR, PRIME_HASH_FACTOR, this.version);
        Iterator<String> it = this.signatureHashes.iterator();
        while (it.hasNext()) {
            iE = (iE * PRIME_HASH_FACTOR) + it.next().hashCode();
        }
        return iE;
    }

    public BrowserDescriptor(String str, Set<String> set, String str2, boolean z5) {
        this.packageName = str;
        this.signatureHashes = set;
        this.version = str2;
        this.useCustomTab = Boolean.valueOf(z5);
    }
}

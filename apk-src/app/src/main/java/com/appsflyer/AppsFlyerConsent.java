package com.appsflyer;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class AppsFlyerConsent {
    public static final Companion Companion = new Companion(null);
    private final Boolean hasConsentForAdStorage;
    private final Boolean hasConsentForAdsPersonalization;
    private final Boolean hasConsentForDataUsage;
    private final Boolean isUserSubjectToGDPR;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        private Companion() {
        }

        public final AppsFlyerConsent forGDPRUser(boolean z5, boolean z10) {
            return new AppsFlyerConsent(Boolean.TRUE, Boolean.valueOf(z5), Boolean.valueOf(z10), null, 8, null);
        }

        public final AppsFlyerConsent forNonGDPRUser() {
            return new AppsFlyerConsent(Boolean.FALSE, null, null, null, 8, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AppsFlyerConsent(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.isUserSubjectToGDPR = bool;
        this.hasConsentForDataUsage = bool2;
        this.hasConsentForAdsPersonalization = bool3;
        this.hasConsentForAdStorage = bool4;
    }

    public static /* synthetic */ AppsFlyerConsent copy$default(AppsFlyerConsent appsFlyerConsent, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = appsFlyerConsent.isUserSubjectToGDPR;
        }
        if ((i & 2) != 0) {
            bool2 = appsFlyerConsent.hasConsentForDataUsage;
        }
        if ((i & 4) != 0) {
            bool3 = appsFlyerConsent.hasConsentForAdsPersonalization;
        }
        if ((i & 8) != 0) {
            bool4 = appsFlyerConsent.hasConsentForAdStorage;
        }
        return appsFlyerConsent.copy(bool, bool2, bool3, bool4);
    }

    public static final AppsFlyerConsent forGDPRUser(boolean z5, boolean z10) {
        return Companion.forGDPRUser(z5, z10);
    }

    public static final AppsFlyerConsent forNonGDPRUser() {
        return Companion.forNonGDPRUser();
    }

    public final Boolean component1() {
        return this.isUserSubjectToGDPR;
    }

    public final Boolean component2() {
        return this.hasConsentForDataUsage;
    }

    public final Boolean component3() {
        return this.hasConsentForAdsPersonalization;
    }

    public final Boolean component4() {
        return this.hasConsentForAdStorage;
    }

    public final AppsFlyerConsent copy(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        return new AppsFlyerConsent(bool, bool2, bool3, bool4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsFlyerConsent)) {
            return false;
        }
        AppsFlyerConsent appsFlyerConsent = (AppsFlyerConsent) obj;
        return Intrinsics.a(this.isUserSubjectToGDPR, appsFlyerConsent.isUserSubjectToGDPR) && Intrinsics.a(this.hasConsentForDataUsage, appsFlyerConsent.hasConsentForDataUsage) && Intrinsics.a(this.hasConsentForAdsPersonalization, appsFlyerConsent.hasConsentForAdsPersonalization) && Intrinsics.a(this.hasConsentForAdStorage, appsFlyerConsent.hasConsentForAdStorage);
    }

    public final Boolean getHasConsentForAdStorage() {
        return this.hasConsentForAdStorage;
    }

    public final Boolean getHasConsentForAdsPersonalization() {
        return this.hasConsentForAdsPersonalization;
    }

    public final Boolean getHasConsentForDataUsage() {
        return this.hasConsentForDataUsage;
    }

    public final int hashCode() {
        Boolean bool = this.isUserSubjectToGDPR;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.hasConsentForDataUsage;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.hasConsentForAdsPersonalization;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.hasConsentForAdStorage;
        return iHashCode3 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final Boolean isUserSubjectToGDPR() {
        return this.isUserSubjectToGDPR;
    }

    public final String toString() {
        return "AppsFlyerConsent(isUserSubjectToGDPR=" + this.isUserSubjectToGDPR + ", hasConsentForDataUsage=" + this.hasConsentForDataUsage + ", hasConsentForAdsPersonalization=" + this.hasConsentForAdsPersonalization + ", hasConsentForAdStorage=" + this.hasConsentForAdStorage + ")";
    }

    public /* synthetic */ AppsFlyerConsent(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : bool4);
    }

    public AppsFlyerConsent() {
        this(null, null, null, null, 15, null);
    }

    public AppsFlyerConsent(Boolean bool) {
        this(bool, null, null, null, 14, null);
    }

    public AppsFlyerConsent(Boolean bool, Boolean bool2) {
        this(bool, bool2, null, null, 12, null);
    }

    public AppsFlyerConsent(Boolean bool, Boolean bool2, Boolean bool3) {
        this(bool, bool2, bool3, null, 8, null);
    }
}

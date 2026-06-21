package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class sw {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final rw f43101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ sw[] f43102e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f43104c;

    static {
        sw[] swVarArr = {new sw(0, "CONSENT_STRING", "IABConsent_ConsentString", "IABTCF_TCString"), new sw(1, "GDPR", "IABConsent_SubjectToGDPR", "IABTCF_gdprApplies"), new sw(2, "CMP_PRESENT", "IABConsent_CMPPresent", "IABTCF_CmpSdkID"), new sw(3, "PURPOSE_CONSENTS", "IABConsent_ParsedPurposeConsents", "IABTCF_PurposeConsents"), new sw(4, "VENDOR_CONSENTS", "IABConsent_ParsedVendorConsents", "IABTCF_VendorConsents"), new sw(5, "ADDITIONAL_CONSENT", null, "IABTCF_AddtlConsent")};
        f43102e = swVarArr;
        hl.d.k(swVarArr);
        f43101d = new rw();
    }

    public sw(int i, String str, String str2, String str3) {
        this.f43103b = str2;
        this.f43104c = str3;
    }

    public static sw valueOf(String str) {
        return (sw) Enum.valueOf(sw.class, str);
    }

    public static sw[] values() {
        return (sw[]) f43102e.clone();
    }
}

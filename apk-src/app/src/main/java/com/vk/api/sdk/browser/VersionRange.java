package com.vk.api.sdk.browser;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class VersionRange {
    public static final VersionRange ANY_VERSION = new VersionRange(null, null);
    private DelimitedVersion mLowerBound;
    private DelimitedVersion mUpperBound;

    public VersionRange(DelimitedVersion delimitedVersion, DelimitedVersion delimitedVersion2) {
        this.mLowerBound = delimitedVersion;
        this.mUpperBound = delimitedVersion2;
    }

    public static VersionRange atLeast(String str) {
        return atLeast(DelimitedVersion.parse(str));
    }

    public static VersionRange atMost(String str) {
        return atMost(DelimitedVersion.parse(str));
    }

    public static VersionRange between(String str, String str2) {
        return new VersionRange(DelimitedVersion.parse(str), DelimitedVersion.parse(str2));
    }

    public boolean matches(String str) {
        return matches(DelimitedVersion.parse(str));
    }

    public String toString() {
        if (this.mLowerBound == null) {
            if (this.mUpperBound == null) {
                return "any version";
            }
            return this.mUpperBound.toString() + " or lower";
        }
        if (this.mUpperBound == null) {
            return this.mLowerBound.toString() + " or higher";
        }
        return "between " + this.mLowerBound + " and " + this.mUpperBound;
    }

    public static VersionRange atLeast(DelimitedVersion delimitedVersion) {
        return new VersionRange(delimitedVersion, null);
    }

    public static VersionRange atMost(DelimitedVersion delimitedVersion) {
        return new VersionRange(null, delimitedVersion);
    }

    public boolean matches(DelimitedVersion delimitedVersion) {
        DelimitedVersion delimitedVersion2 = this.mLowerBound;
        if (delimitedVersion2 != null && delimitedVersion2.compareTo(delimitedVersion) > 0) {
            return false;
        }
        DelimitedVersion delimitedVersion3 = this.mUpperBound;
        return delimitedVersion3 == null || delimitedVersion3.compareTo(delimitedVersion) >= 0;
    }
}

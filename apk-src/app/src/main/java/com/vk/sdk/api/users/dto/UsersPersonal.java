package com.vk.sdk.api.users.dto;

import a0.u;
import gf.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class UsersPersonal {

    @b("alcohol")
    @Nullable
    private final Integer alcohol;

    @b("inspired_by")
    @Nullable
    private final String inspiredBy;

    @b("langs")
    @Nullable
    private final List<String> langs;

    @b("life_main")
    @Nullable
    private final Integer lifeMain;

    @b("people_main")
    @Nullable
    private final Integer peopleMain;

    @b("political")
    @Nullable
    private final Integer political;

    @b("religion")
    @Nullable
    private final String religion;

    @b("religion_id")
    @Nullable
    private final Integer religionId;

    @b("smoking")
    @Nullable
    private final Integer smoking;

    public UsersPersonal() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UsersPersonal copy$default(UsersPersonal usersPersonal, Integer num, String str, List list, Integer num2, Integer num3, Integer num4, String str2, Integer num5, Integer num6, int i, Object obj) {
        if ((i & 1) != 0) {
            num = usersPersonal.alcohol;
        }
        if ((i & 2) != 0) {
            str = usersPersonal.inspiredBy;
        }
        if ((i & 4) != 0) {
            list = usersPersonal.langs;
        }
        if ((i & 8) != 0) {
            num2 = usersPersonal.lifeMain;
        }
        if ((i & 16) != 0) {
            num3 = usersPersonal.peopleMain;
        }
        if ((i & 32) != 0) {
            num4 = usersPersonal.political;
        }
        if ((i & 64) != 0) {
            str2 = usersPersonal.religion;
        }
        if ((i & 128) != 0) {
            num5 = usersPersonal.religionId;
        }
        if ((i & 256) != 0) {
            num6 = usersPersonal.smoking;
        }
        Integer num7 = num5;
        Integer num8 = num6;
        Integer num9 = num4;
        String str3 = str2;
        Integer num10 = num3;
        List list2 = list;
        return usersPersonal.copy(num, str, list2, num2, num10, num9, str3, num7, num8);
    }

    @Nullable
    public final Integer component1() {
        return this.alcohol;
    }

    @Nullable
    public final String component2() {
        return this.inspiredBy;
    }

    @Nullable
    public final List<String> component3() {
        return this.langs;
    }

    @Nullable
    public final Integer component4() {
        return this.lifeMain;
    }

    @Nullable
    public final Integer component5() {
        return this.peopleMain;
    }

    @Nullable
    public final Integer component6() {
        return this.political;
    }

    @Nullable
    public final String component7() {
        return this.religion;
    }

    @Nullable
    public final Integer component8() {
        return this.religionId;
    }

    @Nullable
    public final Integer component9() {
        return this.smoking;
    }

    @NotNull
    public final UsersPersonal copy(@Nullable Integer num, @Nullable String str, @Nullable List<String> list, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable String str2, @Nullable Integer num5, @Nullable Integer num6) {
        return new UsersPersonal(num, str, list, num2, num3, num4, str2, num5, num6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersPersonal)) {
            return false;
        }
        UsersPersonal usersPersonal = (UsersPersonal) obj;
        return Intrinsics.a(this.alcohol, usersPersonal.alcohol) && Intrinsics.a(this.inspiredBy, usersPersonal.inspiredBy) && Intrinsics.a(this.langs, usersPersonal.langs) && Intrinsics.a(this.lifeMain, usersPersonal.lifeMain) && Intrinsics.a(this.peopleMain, usersPersonal.peopleMain) && Intrinsics.a(this.political, usersPersonal.political) && Intrinsics.a(this.religion, usersPersonal.religion) && Intrinsics.a(this.religionId, usersPersonal.religionId) && Intrinsics.a(this.smoking, usersPersonal.smoking);
    }

    @Nullable
    public final Integer getAlcohol() {
        return this.alcohol;
    }

    @Nullable
    public final String getInspiredBy() {
        return this.inspiredBy;
    }

    @Nullable
    public final List<String> getLangs() {
        return this.langs;
    }

    @Nullable
    public final Integer getLifeMain() {
        return this.lifeMain;
    }

    @Nullable
    public final Integer getPeopleMain() {
        return this.peopleMain;
    }

    @Nullable
    public final Integer getPolitical() {
        return this.political;
    }

    @Nullable
    public final String getReligion() {
        return this.religion;
    }

    @Nullable
    public final Integer getReligionId() {
        return this.religionId;
    }

    @Nullable
    public final Integer getSmoking() {
        return this.smoking;
    }

    public int hashCode() {
        Integer num = this.alcohol;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.inspiredBy;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.langs;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.lifeMain;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.peopleMain;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.political;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str2 = this.religion;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num5 = this.religionId;
        int iHashCode8 = (iHashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.smoking;
        return iHashCode8 + (num6 != null ? num6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.alcohol;
        String str = this.inspiredBy;
        List<String> list = this.langs;
        Integer num2 = this.lifeMain;
        Integer num3 = this.peopleMain;
        Integer num4 = this.political;
        String str2 = this.religion;
        Integer num5 = this.religionId;
        Integer num6 = this.smoking;
        StringBuilder sb2 = new StringBuilder("UsersPersonal(alcohol=");
        sb2.append(num);
        sb2.append(", inspiredBy=");
        sb2.append(str);
        sb2.append(", langs=");
        sb2.append(list);
        sb2.append(", lifeMain=");
        sb2.append(num2);
        sb2.append(", peopleMain=");
        a.t(sb2, num3, ", political=", num4, ", religion=");
        a.r(num5, str2, ", religionId=", ", smoking=", sb2);
        return u.m(sb2, num6, ")");
    }

    public UsersPersonal(@Nullable Integer num, @Nullable String str, @Nullable List<String> list, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable String str2, @Nullable Integer num5, @Nullable Integer num6) {
        this.alcohol = num;
        this.inspiredBy = str;
        this.langs = list;
        this.lifeMain = num2;
        this.peopleMain = num3;
        this.political = num4;
        this.religion = str2;
        this.religionId = num5;
        this.smoking = num6;
    }

    public /* synthetic */ UsersPersonal(Integer num, String str, List list, Integer num2, Integer num3, Integer num4, String str2, Integer num5, Integer num6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : num4, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : num5, (i & 256) != 0 ? null : num6);
    }
}

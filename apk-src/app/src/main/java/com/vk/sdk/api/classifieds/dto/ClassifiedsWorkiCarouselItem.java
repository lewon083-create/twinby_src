package com.vk.sdk.api.classifieds.dto;

import com.vk.sdk.api.base.dto.BaseLinkButton;
import gf.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l7.o;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t.z;

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
public final class ClassifiedsWorkiCarouselItem {

    @b("action_button")
    @Nullable
    private final BaseLinkButton actionButton;

    @b("category_id")
    @Nullable
    private final Integer categoryId;

    @b("company")
    @NotNull
    private final String company;

    @b("distance")
    @Nullable
    private final String distance;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @NotNull
    private final String f15151id;

    @b("profession")
    @NotNull
    private final String profession;

    @b("salary")
    @NotNull
    private final String salary;

    public ClassifiedsWorkiCarouselItem(@NotNull String id2, @NotNull String company, @NotNull String profession, @NotNull String salary, @Nullable String str, @Nullable Integer num, @Nullable BaseLinkButton baseLinkButton) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(company, "company");
        Intrinsics.checkNotNullParameter(profession, "profession");
        Intrinsics.checkNotNullParameter(salary, "salary");
        this.f15151id = id2;
        this.company = company;
        this.profession = profession;
        this.salary = salary;
        this.distance = str;
        this.categoryId = num;
        this.actionButton = baseLinkButton;
    }

    public static /* synthetic */ ClassifiedsWorkiCarouselItem copy$default(ClassifiedsWorkiCarouselItem classifiedsWorkiCarouselItem, String str, String str2, String str3, String str4, String str5, Integer num, BaseLinkButton baseLinkButton, int i, Object obj) {
        if ((i & 1) != 0) {
            str = classifiedsWorkiCarouselItem.f15151id;
        }
        if ((i & 2) != 0) {
            str2 = classifiedsWorkiCarouselItem.company;
        }
        if ((i & 4) != 0) {
            str3 = classifiedsWorkiCarouselItem.profession;
        }
        if ((i & 8) != 0) {
            str4 = classifiedsWorkiCarouselItem.salary;
        }
        if ((i & 16) != 0) {
            str5 = classifiedsWorkiCarouselItem.distance;
        }
        if ((i & 32) != 0) {
            num = classifiedsWorkiCarouselItem.categoryId;
        }
        if ((i & 64) != 0) {
            baseLinkButton = classifiedsWorkiCarouselItem.actionButton;
        }
        Integer num2 = num;
        BaseLinkButton baseLinkButton2 = baseLinkButton;
        String str6 = str5;
        String str7 = str3;
        return classifiedsWorkiCarouselItem.copy(str, str2, str7, str4, str6, num2, baseLinkButton2);
    }

    @NotNull
    public final String component1() {
        return this.f15151id;
    }

    @NotNull
    public final String component2() {
        return this.company;
    }

    @NotNull
    public final String component3() {
        return this.profession;
    }

    @NotNull
    public final String component4() {
        return this.salary;
    }

    @Nullable
    public final String component5() {
        return this.distance;
    }

    @Nullable
    public final Integer component6() {
        return this.categoryId;
    }

    @Nullable
    public final BaseLinkButton component7() {
        return this.actionButton;
    }

    @NotNull
    public final ClassifiedsWorkiCarouselItem copy(@NotNull String id2, @NotNull String company, @NotNull String profession, @NotNull String salary, @Nullable String str, @Nullable Integer num, @Nullable BaseLinkButton baseLinkButton) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(company, "company");
        Intrinsics.checkNotNullParameter(profession, "profession");
        Intrinsics.checkNotNullParameter(salary, "salary");
        return new ClassifiedsWorkiCarouselItem(id2, company, profession, salary, str, num, baseLinkButton);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsWorkiCarouselItem)) {
            return false;
        }
        ClassifiedsWorkiCarouselItem classifiedsWorkiCarouselItem = (ClassifiedsWorkiCarouselItem) obj;
        return Intrinsics.a(this.f15151id, classifiedsWorkiCarouselItem.f15151id) && Intrinsics.a(this.company, classifiedsWorkiCarouselItem.company) && Intrinsics.a(this.profession, classifiedsWorkiCarouselItem.profession) && Intrinsics.a(this.salary, classifiedsWorkiCarouselItem.salary) && Intrinsics.a(this.distance, classifiedsWorkiCarouselItem.distance) && Intrinsics.a(this.categoryId, classifiedsWorkiCarouselItem.categoryId) && Intrinsics.a(this.actionButton, classifiedsWorkiCarouselItem.actionButton);
    }

    @Nullable
    public final BaseLinkButton getActionButton() {
        return this.actionButton;
    }

    @Nullable
    public final Integer getCategoryId() {
        return this.categoryId;
    }

    @NotNull
    public final String getCompany() {
        return this.company;
    }

    @Nullable
    public final String getDistance() {
        return this.distance;
    }

    @NotNull
    public final String getId() {
        return this.f15151id;
    }

    @NotNull
    public final String getProfession() {
        return this.profession;
    }

    @NotNull
    public final String getSalary() {
        return this.salary;
    }

    public int hashCode() {
        int iE = a.e(a.e(a.e(this.f15151id.hashCode() * 31, 31, this.company), 31, this.profession), 31, this.salary);
        String str = this.distance;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.categoryId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        BaseLinkButton baseLinkButton = this.actionButton;
        return iHashCode2 + (baseLinkButton != null ? baseLinkButton.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f15151id;
        String str2 = this.company;
        String str3 = this.profession;
        String str4 = this.salary;
        String str5 = this.distance;
        Integer num = this.categoryId;
        BaseLinkButton baseLinkButton = this.actionButton;
        StringBuilder sbJ = z.j("ClassifiedsWorkiCarouselItem(id=", str, ", company=", str2, ", profession=");
        o.t(sbJ, str3, ", salary=", str4, ", distance=");
        a.r(num, str5, ", categoryId=", ", actionButton=", sbJ);
        sbJ.append(baseLinkButton);
        sbJ.append(")");
        return sbJ.toString();
    }

    public /* synthetic */ ClassifiedsWorkiCarouselItem(String str, String str2, String str3, String str4, String str5, Integer num, BaseLinkButton baseLinkButton, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : baseLinkButton);
    }
}

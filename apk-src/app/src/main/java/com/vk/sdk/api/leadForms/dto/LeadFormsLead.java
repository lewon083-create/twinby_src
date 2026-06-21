package com.vk.sdk.api.leadForms.dto;

import a0.u;
import com.vk.dto.common.id.UserId;
import io.sentry.TraceContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l7.o;
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
public final class LeadFormsLead {

    @b("ad_id")
    @Nullable
    private final Integer adId;

    @b("answers")
    @NotNull
    private final List<LeadFormsAnswer> answers;

    @b("date")
    private final int date;

    @b("lead_id")
    private final int leadId;

    @b(TraceContext.JsonKeys.USER_ID)
    @NotNull
    private final UserId userId;

    public LeadFormsLead(int i, @NotNull UserId userId, int i10, @NotNull List<LeadFormsAnswer> answers, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(answers, "answers");
        this.leadId = i;
        this.userId = userId;
        this.date = i10;
        this.answers = answers;
        this.adId = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LeadFormsLead copy$default(LeadFormsLead leadFormsLead, int i, UserId userId, int i10, List list, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i = leadFormsLead.leadId;
        }
        if ((i11 & 2) != 0) {
            userId = leadFormsLead.userId;
        }
        if ((i11 & 4) != 0) {
            i10 = leadFormsLead.date;
        }
        if ((i11 & 8) != 0) {
            list = leadFormsLead.answers;
        }
        if ((i11 & 16) != 0) {
            num = leadFormsLead.adId;
        }
        Integer num2 = num;
        int i12 = i10;
        return leadFormsLead.copy(i, userId, i12, list, num2);
    }

    public final int component1() {
        return this.leadId;
    }

    @NotNull
    public final UserId component2() {
        return this.userId;
    }

    public final int component3() {
        return this.date;
    }

    @NotNull
    public final List<LeadFormsAnswer> component4() {
        return this.answers;
    }

    @Nullable
    public final Integer component5() {
        return this.adId;
    }

    @NotNull
    public final LeadFormsLead copy(int i, @NotNull UserId userId, int i10, @NotNull List<LeadFormsAnswer> answers, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(answers, "answers");
        return new LeadFormsLead(i, userId, i10, answers, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadFormsLead)) {
            return false;
        }
        LeadFormsLead leadFormsLead = (LeadFormsLead) obj;
        return this.leadId == leadFormsLead.leadId && Intrinsics.a(this.userId, leadFormsLead.userId) && this.date == leadFormsLead.date && Intrinsics.a(this.answers, leadFormsLead.answers) && Intrinsics.a(this.adId, leadFormsLead.adId);
    }

    @Nullable
    public final Integer getAdId() {
        return this.adId;
    }

    @NotNull
    public final List<LeadFormsAnswer> getAnswers() {
        return this.answers;
    }

    public final int getDate() {
        return this.date;
    }

    public final int getLeadId() {
        return this.leadId;
    }

    @NotNull
    public final UserId getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int i = u.i(this.answers, u.g(this.date, o.e(this.userId, Integer.hashCode(this.leadId) * 31, 31), 31), 31);
        Integer num = this.adId;
        return i + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        int i = this.leadId;
        UserId userId = this.userId;
        int i10 = this.date;
        List<LeadFormsAnswer> list = this.answers;
        Integer num = this.adId;
        StringBuilder sb2 = new StringBuilder("LeadFormsLead(leadId=");
        sb2.append(i);
        sb2.append(", userId=");
        sb2.append(userId);
        sb2.append(", date=");
        sb2.append(i10);
        sb2.append(", answers=");
        sb2.append(list);
        sb2.append(", adId=");
        return u.m(sb2, num, ")");
    }

    public /* synthetic */ LeadFormsLead(int i, UserId userId, int i10, List list, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, userId, i10, list, (i11 & 16) != 0 ? null : num);
    }
}

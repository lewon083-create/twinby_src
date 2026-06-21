package fh;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateDeserializer;
import io.appmetrica.analytics.impl.A2;
import io.sentry.protocol.Device;
import io.sentry.protocol.ViewHierarchyNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class bk implements TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f16945a;

    public bk(sy syVar) {
        this.f16945a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final kk deserialize(ParsingContext parsingContext, kk kkVar, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        Field field = kkVar != null ? kkVar.f17582a : null;
        sy syVar = this.f16945a;
        Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, field, syVar.I);
        Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", dk.f17103k, allowPropertyOverride, kkVar != null ? kkVar.f17583b : null, v0.f18733v);
        Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", dk.f17104l, allowPropertyOverride, kkVar != null ? kkVar.f17584c : null, v0.f18734w);
        Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, ViewHierarchyNode.JsonKeys.ALPHA, TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, kkVar != null ? kkVar.f17585d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, dk.f17109q);
        Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, kkVar != null ? kkVar.f17586e : null, syVar.f18544u1);
        Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, A2.f22054g, allowPropertyOverride, kkVar != null ? kkVar.f17587f : null, syVar.G1);
        Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "border", allowPropertyOverride, kkVar != null ? kkVar.f17588g : null, syVar.M1);
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Field field2 = kkVar != null ? kkVar.f17589h : null;
        Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
        Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper, allowPropertyOverride, field2, function1, dk.f17110r);
        TypeHelper typeHelper2 = dk.f17105m;
        Field field3 = kkVar != null ? kkVar.i : null;
        mg mgVar = mg.f17861t;
        Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "cross_axis_alignment", typeHelper2, allowPropertyOverride, field3, mgVar);
        Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "default_item", typeHelper, allowPropertyOverride, kkVar != null ? kkVar.f17590j : null, function1, dk.f17111s);
        Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, kkVar != null ? kkVar.f17591k : null, syVar.P2);
        Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, kkVar != null ? kkVar.f17592l : null, syVar.f18346b3);
        Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, kkVar != null ? kkVar.f17593m : null, syVar.f18594z3);
        Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, kkVar != null ? kkVar.f17594n : null, syVar.I3);
        Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, kkVar != null ? kkVar.f17595o : null, syVar.U6);
        Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, kkVar != null ? kkVar.f17596p : null);
        TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
        Field field4 = kkVar != null ? kkVar.f17597q : null;
        Function1<Object, Boolean> function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
        Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "infinite_scroll", typeHelper3, allowPropertyOverride, field4, function12);
        Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "item_builder", allowPropertyOverride, kkVar != null ? kkVar.f17598r : null, syVar.f18379e2);
        Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "item_spacing", allowPropertyOverride, kkVar != null ? kkVar.f17599s : null, syVar.f18564w3);
        Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "items", allowPropertyOverride, kkVar != null ? kkVar.f17600t : null, syVar.f18541t9);
        Field field5 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "layout_mode", allowPropertyOverride, kkVar != null ? kkVar.f17601u : null, syVar.u5);
        Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, kkVar != null ? kkVar.f17602v : null, syVar.K4);
        Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, kkVar != null ? kkVar.f17603w : null, syVar.Y2);
        Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, Device.JsonKeys.ORIENTATION, dk.f17106n, allowPropertyOverride, kkVar != null ? kkVar.f17604x : null, mg.f17862u);
        Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, kkVar != null ? kkVar.f17605y : null, syVar.Y2);
        Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "page_transformation", allowPropertyOverride, kkVar != null ? kkVar.f17606z : null, syVar.f18516r5);
        Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "restrict_parent_scroll", typeHelper3, allowPropertyOverride, kkVar != null ? kkVar.A : null, function12);
        Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, kkVar != null ? kkVar.B : null);
        Field optionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper, allowPropertyOverride, kkVar != null ? kkVar.C : null, function1, dk.f17112t);
        Field optionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "scroll_axis_alignment", dk.f17107o, allowPropertyOverride, kkVar != null ? kkVar.D : null, mgVar);
        Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, kkVar != null ? kkVar.E : null, syVar.f18453l1);
        Field optionalListField8 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, kkVar != null ? kkVar.F : null, syVar.P8);
        Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, kkVar != null ? kkVar.G : null, syVar.S8);
        Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, kkVar != null ? kkVar.H : null, syVar.V1);
        Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, kkVar != null ? kkVar.I : null, syVar.A1);
        Field optionalField15 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, kkVar != null ? kkVar.J : null, syVar.A1);
        Field field6 = kkVar != null ? kkVar.K : null;
        kv kvVar = kv.f17646g;
        zj zjVar = dk.f17113u;
        Intrinsics.c(zjVar, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
        return new kk(optionalField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField, optionalListField2, optionalField2, optionalFieldWithExpression4, optionalFieldWithExpression5, optionalFieldWithExpression6, optionalListField3, optionalListField4, optionalField3, optionalListField5, optionalField4, optionalField5, optionalFieldWithExpression7, optionalField6, optionalField7, optionalListField6, field5, optionalField8, optionalField9, optionalFieldWithExpression8, optionalField10, optionalField11, optionalFieldWithExpression9, optionalFieldWithExpression10, optionalFieldWithExpression11, optionalFieldWithExpression12, optionalListField7, optionalListField8, optionalField12, optionalField13, optionalField14, optionalField15, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field6, kvVar, zjVar), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, kkVar != null ? kkVar.L : null, syVar.V8), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, kkVar != null ? kkVar.M : null, syVar.f18352b9), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, ViewHierarchyNode.JsonKeys.VISIBILITY, dk.f17108p, allowPropertyOverride, kkVar != null ? kkVar.N : null, kv.f17653o), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, kkVar != null ? kkVar.O : null, syVar.f18481n9), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, kkVar != null ? kkVar.P : null, syVar.f18481n9), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, kkVar != null ? kkVar.Q : null, syVar.U6));
    }
}

// This file is automatically generated DO NOT MODIFY!
package infovis;

import infovis.column.ColumnFactory;
import infovis.metadata.AggregationFactory;
import infovis.column.ColumnFactory;
import infovis.graph.io.GraphReaderFactory;
import infovis.graph.io.GraphWriterFactory;
import infovis.graph.visualization.layout.GraphLayoutFactory;
import infovis.metadata.AggregationFactory;
import infovis.panel.ControlPanelFactory;
import infovis.panel.render.VisualPanelFactory;
import infovis.table.io.TableReaderFactory;
import infovis.tree.io.TreeReaderFactory;
import infovis.tree.visualization.nodelink.TreeLayoutFactory;
import infovis.tree.visualization.treemap.TreemapFactory;
import infovis.visualization.VisualizationFactory;
import infovis.visualization.inter.InteractorFactory;
import infovis.visualization.inter.RendererInteractorFactory;
import infovis.visualization.linkShapers.LinkShaperFactory;
import infovis.visualization.render.ItemRendererFactory;

public class InitFactories {
	public static void init() {
	AggregationFactory.getInstance().add("Additive","infovis.metadata.AdditiveAggregation",null);
	AggregationFactory.getInstance().add("AtLeaf","infovis.metadata.AtLeafAggregation",null);
	AggregationFactory.getInstance().add("Min","infovis.metadata.MinAggregation",null);
	ColumnFactory.getInstance().add("bool","infovis.column.BooleanColumn","DENSE");
	ColumnFactory.getInstance().add("boolean","infovis.column.BooleanColumn","DENSE");
	ColumnFactory.getInstance().add("cat","infovis.column.CategoricalColumn","DENSE");
	ColumnFactory.getInstance().add("categorical","infovis.column.CategoricalColumn","DENSE");
	ColumnFactory.getInstance().add("color","infovis.column.ColorColumn","DENSE");
	ColumnFactory.getInstance().add("date","infovis.column.DateColumn","DENSE");
	ColumnFactory.getInstance().add("double","infovis.column.DoubleColumn","DENSE");
	ColumnFactory.getInstance().add("float","infovis.column.FloatColumn","DENSE");
	ColumnFactory.getInstance().add("int","infovis.column.IntColumn","DENSE");
	ColumnFactory.getInstance().add("integer","infovis.column.IntColumn","DENSE");
	ColumnFactory.getInstance().add("long","infovis.column.LongColumn","DENSE");
	ColumnFactory.getInstance().add("object","infovis.column.ObjectColumn","DENSE");
	ColumnFactory.getInstance().add("real","infovis.column.DoubleColumn","DENSE");
	ColumnFactory.getInstance().add("string","infovis.column.StringColumn","DENSE");
	ControlPanelFactory.getInstance().add("infovis.column.visualization.ColumnsVisualization","infovis.column.visualization.ColumnsVisualizationControlPanel",null);
	ControlPanelFactory.getInstance().add("infovis.graph.visualization.GraphVisualization","infovis.graph.visualization.GraphControlPanel",null);
	ControlPanelFactory.getInstance().add("infovis.graph.visualization.MatrixVisualization","infovis.graph.visualization.MatrixControlPanel",null);
	ControlPanelFactory.getInstance().add("infovis.graph.visualization.NodeLinkGraphVisualization","infovis.graph.visualization.NodeLinkGraphControlPanel",null);
	ControlPanelFactory.getInstance().add("infovis.table.visualization.ScatterPlotVisualization","infovis.table.visualization.ScatterPlotControlPanel",null);
	ControlPanelFactory.getInstance().add("infovis.table.visualization.TimeSeriesVisualization","infovis.table.visualization.TimeSeriesControlPanel",null);
	ControlPanelFactory.getInstance().add("infovis.tree.visualization.IcicleTreeVisualization","infovis.tree.visualization.IcicleTreeControlPanel",null);
	ControlPanelFactory.getInstance().add("infovis.tree.visualization.NodeLinkTreeVisualization","infovis.tree.visualization.NodeLinkTreeControlPanel",null);
	ControlPanelFactory.getInstance().add("infovis.tree.visualization.TreemapVisualization","infovis.tree.visualization.treemap.TreemapControlPanel",null);
	ControlPanelFactory.getInstance().add("infovis.visualization.DefaultVisualization","infovis.panel.ControlPanel",null);
	GraphLayoutFactory.getInstance().add("Circular","infovis.graph.visualization.layout.CircularLayout",null);
	GraphLayoutFactory.getInstance().add("Fruchterman&Reingold (Spring)","infovis.graph.visualization.layout.FRLayout",null);
	GraphLayoutFactory.getInstance().add("GraphViz/circo","infovis.graph.visualization.layout.GraphVizLayout","circo");
	GraphLayoutFactory.getInstance().add("GraphViz/dot","infovis.graph.visualization.layout.GraphVizLayout","dot");
	GraphLayoutFactory.getInstance().add("GraphViz/fdp","infovis.graph.visualization.layout.GraphVizLayout","fdp");
	GraphLayoutFactory.getInstance().add("GraphViz/neato","infovis.graph.visualization.layout.GraphVizLayout","neato");
	GraphLayoutFactory.getInstance().add("GraphViz/twopi","infovis.graph.visualization.layout.GraphVizLayout","twopi");
	GraphLayoutFactory.getInstance().add("PolyLog","infovis.graph.visualization.layout.MinimizerPolyLog",null);
	GraphLayoutFactory.getInstance().add("Random","infovis.graph.visualization.layout.RandomGraphLayout",null);
	GraphLayoutFactory.getInstance().add("Spring","infovis.graph.visualization.layout.SpringLayout",null);
	GraphReaderFactory.getInstance().add("adj","infovis.graph.io.AdjGraphReader",null);
	GraphReaderFactory.getInstance().add("dot","infovis.graph.io.DOTGraphReader",null);
	GraphReaderFactory.getInstance().add("el","infovis.graph.io.AdjGraphReader",null);
	GraphReaderFactory.getInstance().add("gml","infovis.graph.io.GMLGraphReader",null);
	GraphReaderFactory.getInstance().add("graph","infovis.graph.io.ChacoGraphReader",null);
	GraphReaderFactory.getInstance().add("html","infovis.graph.io.HTMLGraphReader",null);
	GraphReaderFactory.getInstance().add("net","infovis.graph.io.PajekNetReader",null);
	GraphReaderFactory.getInstance().add("vcg","infovis.graph.io.VCGGraphReader",null);
	GraphReaderFactory.getInstance().add("xml","infovis.graph.io.GraphMLReader",null);
	GraphWriterFactory.getInstance().add("dot","infovis.graph.io.DOTGraphWriter","GraphViz");
	GraphWriterFactory.getInstance().add("gml","infovis.graph.io.GraphMLWriter","GraphML");
	GraphWriterFactory.getInstance().add("net","infovis.graph.io.PajekGraphWriter","Pajek");
	GraphWriterFactory.getInstance().add("vcg","infovis.graph.io.VCGGraphWriter",null);
	InteractorFactory.getInstance().add("infovis.table.visualization.TimeSeriesVisualization","infovis.visualization.inter.DefaultVisualizationInteractor","infovis.visualization.DefaultVisualization");
	InteractorFactory.getInstance().add("infovis.visualization.DefaultVisualization","infovis.visualization.inter.DefaultVisualizationInteractor",null);
	InteractorFactory.getInstance().add("infovis.visualization.StrokingVisualization","infovis.visualization.inter.BasicVisualizationInteractor","infovis.Visualization");
	InteractorFactory.getInstance().add("infovis.visualization.magicLens.ExcentricLabelVisualization","infovis.visualization.inter.ExcentricVisualizationInteractor",null);
	ItemRendererFactory.getInstance().add("infovis.tree.visualization.TreemapVisualization","infovis.tree.visualization.treemap.TreemapItemRenderer",null);
	ItemRendererFactory.getInstance().add("infovis.visualization.DefaultVisualization","infovis.visualization.render.DefaultFillingItemRenderer",null);
	ItemRendererFactory.getInstance().add("infovis.visualization.StrokingVisualization","infovis.visualization.render.DefaultStrokingItemRenderer",null);
	LinkShaperFactory.getInstance().add("Curved","infovis.visualization.linkShapers.CurvedLinkShaper",null);
	LinkShaperFactory.getInstance().add("Dendrogram","infovis.visualization.linkShapers.DendrogramLinkShaper",null);
	LinkShaperFactory.getInstance().add("Smooth","infovis.visualization.linkShapers.SmoothLinkShaper",null);
	LinkShaperFactory.getInstance().add("Straight Line","infovis.visualization.linkShapers.DefaultLinkShaper",null);
	RendererInteractorFactory.getInstance().add("infovis.tree.visualization.TreeVisualSelection","infovis.tree.visualization.TreeInteractor",null);
	RendererInteractorFactory.getInstance().add("infovis.visualization.render.VisualFisheye","infovis.visualization.inter.VisualFisheyeInteractor",null);
	RendererInteractorFactory.getInstance().add("infovis.visualization.render.VisualSelection","infovis.visualization.inter.VisualSelectionInteractor",null);
	TableReaderFactory.getInstance().add("csv","infovis.table.io.CSVTableReader",null);
	TableReaderFactory.getInstance().add("directory","infovis.tree.io.DirectoryReaderCreator","noopen");
	TableReaderFactory.getInstance().add("tqd","infovis.table.io.TQDTableReader",null);
	TreeLayoutFactory.getInstance().add("Dendrogram","infovis.tree.visualization.nodelink.DendrogramTreeLayout",null);
	TreeLayoutFactory.getInstance().add("Reingold&Tilford","infovis.tree.visualization.nodelink.RTLayout",null);
	TreeLayoutFactory.getInstance().add("Reingold&Tilford Polar","infovis.tree.visualization.nodelink.RTPolar",null);
	TreeLayoutFactory.getInstance().add("Simple","infovis.tree.visualization.nodelink.SimpleTreeLayout",null);
	TreeReaderFactory.getInstance().add("directory","infovis.tree.io.DirectoryReaderCreator","noopen");
	TreeReaderFactory.getInstance().add("jar","infovis.tree.io.JarTreeReader",null);
	TreeReaderFactory.getInstance().add("nh","infovis.tree.io.NewickTreeReader",null);
	TreeReaderFactory.getInstance().add("tm3","infovis.tree.io.TM3TreeReader",null);
	TreeReaderFactory.getInstance().add("xml","infovis.tree.io.XMLTreeReader",null);
	TreemapFactory.getInstance().add("Slice&Dice","infovis.tree.visualization.treemap.SliceAndDice",null);
	TreemapFactory.getInstance().add("Squarified","infovis.tree.visualization.treemap.Squarified",null);
	TreemapFactory.getInstance().add("Strip","infovis.tree.visualization.treemap.Strip",null);
	VisualPanelFactory.getInstance().add("infovis.visualization.render.VisualAlpha","infovis.panel.render.VisualAlphaControlPanel",null);
	VisualPanelFactory.getInstance().add("infovis.visualization.render.VisualArea","infovis.panel.render.VisualAreaControlPanel",null);
	VisualPanelFactory.getInstance().add("infovis.visualization.render.VisualColor","infovis.panel.render.VisualColorControlPanel",null);
	VisualPanelFactory.getInstance().add("infovis.visualization.render.VisualLabel","infovis.panel.render.VisualLabelControlPanel",null);
	VisualPanelFactory.getInstance().add("infovis.visualization.render.VisualSize","infovis.panel.render.VisualSizeControlPanel",null);
	VisualizationFactory.getInstance().add("Graph Matrix","infovis.graph.visualization.MatrixVisualization","infovis.Graph");
	VisualizationFactory.getInstance().add("Graph Node Link","infovis.graph.visualization.NodeLinkGraphVisualization","infovis.Graph");
	VisualizationFactory.getInstance().add("Table Parallel Coordinates","infovis.table.visualization.ParallelCoordinatesVisualization","infovis.Table");
	VisualizationFactory.getInstance().add("Table Scatter Plot","infovis.table.visualization.ScatterPlotVisualization","infovis.Table");
	VisualizationFactory.getInstance().add("Table Time Series","infovis.table.visualization.TimeSeriesVisualization","infovis.Table");
	VisualizationFactory.getInstance().add("Tree Icicle","infovis.tree.visualization.IcicleTreeVisualization","infovis.Tree");
	VisualizationFactory.getInstance().add("Tree Node Link","infovis.tree.visualization.NodeLinkTreeVisualization","infovis.Tree");
	}
}

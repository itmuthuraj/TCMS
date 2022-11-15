<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.io.* "%>
<%@page import="java.sql.*"%>
<%@page import="java.util.Map"%>
<%@page import="com.google.zxing.BarcodeFormat"%>
<%@page import="com.google.zxing.EncodeHintType"%>;
<%@page import="com.google.zxing.MultiFormatWriter"%>
<%@page import="com.google.zxing.client.j2se.MatrixToImageWriter"%>
<%@page import="com.google.zxing.common.BitMatrix"%>
<%@page import="com.google.zxing.qrcode.decoder.ErrorCorrectionLevel"%>
<%@page import="java.util.EnumMap"%>
<%@page import="javax.swing.ImageIcon"%>
<%@page import="javax.swing.JFrame"%>
<%@page import="javax.swing.JLabel"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Qr code</title>
</head>
<body>
	<%
	try {
		String QrCodeData = "https://heroic-torrone-3a16c5.netlify.app/";
		String filePath = "D:\\Gokul\\Qrcode\\qr.png";
		String charset = "UTF-8";
		Map<EncodeHintType, ErrorCorrectionLevel> hintMap = new EnumMap<EncodeHintType, ErrorCorrectionLevel>(
		EncodeHintType.class);
		hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
		BitMatrix matrix = new MultiFormatWriter().encode(new String(QrCodeData.getBytes(charset), charset),
		BarcodeFormat.QR_CODE, 200, 200, hintMap);
		MatrixToImageWriter.writeToFile(matrix, filePath.substring(filePath.lastIndexOf('.') + 1), new File(filePath));
		System.out.println("Qr code has been generated at the location " + filePath);
		JFrame frame = new JFrame();
		ImageIcon icon = new ImageIcon("D:\\Gokul\\Qrcode\\qr.png");
		JLabel label = new JLabel(icon);
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	} catch (Exception e) {
		System.out.println(e);
	}
	%>
</body>
</html>

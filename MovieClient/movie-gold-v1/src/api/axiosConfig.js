import axios from "axios"; // Import axios into the project

export default axios.create({
  // We can configure and export the axios object to the remote API
  baseURL: "https://9c96-103-106-239-104.ap.ngrok.io", // baseURL setting provides base address of the API endpoints that the cliet react app will be calling.
  headers: { "ngrok-skip-browser-warning": "true" }, // Exposes the relevant API endpoints. Needed for client HTTP requests to not be blocked by CORS (Cross Origin Resource Sharing).
});
